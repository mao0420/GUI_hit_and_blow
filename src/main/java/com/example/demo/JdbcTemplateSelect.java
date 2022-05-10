package com.example.demo;

import com.example.demo.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class JdbcTemplateSelect {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String selectAllData(Model model) {
        //SELECT文のクエリ処理を行うメソッド
        //保存したランキングデータの読み込み、プレイ時間の計算も実施し、試行回数→プレイ時間の順に昇順ソート
        String sqlText = "SELECT user_name, try_times, ROUND((end_date - start_date) * 86400) AS play_times FROM record_data ORDER BY try_times, play_times";

        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sqlText);
        List<Data> dataList = new ArrayList<Data>();

        for (Map<String, Object> result : resultList) {
            Data data = new Data();
            data.setUserName((String) result.get("user_name"));
            data.setTryTimes(String.valueOf(result.get("try_times")));
            data.setPlayTimes(String.valueOf(result.get("play_times")));
            dataList.add(data);
        }
        //"model"にリザルトメッセージを表示させる"resultMessage"を格納
        model.addAttribute("resultMessage", "ランキングデータを読み込みました。");
        //"model"にSQLのデータを格納したdataListを格納
        model.addAttribute("dataList", dataList);
        //index.htmlに情報を返す
        return "index";
    }

//    public void insertAllData(Model model){
//        //INSERT文のクエリ処理を行うクラス
////        String sqlText  = "INSERT INTO record_data (user_name, try_times, startDate, end_date) VALUES(?,?,?,?)";
////        jdbcTemplate.update(sqlText,clearDataList.get(0),clearDataList.get(1),clearDataList.get(2),clearDataList.get(3));
//        jdbcTemplate.update("INSERT INTO record_data (user_name, try_times, startDate, end_date) VALUES(SQLテスト太郎,8,2022-05-09 02:00:12,2022-05-09 02:03:12)");
//    }
}