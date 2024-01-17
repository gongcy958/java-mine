package com.yy.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gongcy
 * @date 2023/7/18 1:39 下午
 * @Description
 */
public class CDATAParser {

    public static void main(String[] args) {
        String input = "<![CDATA[<string><REQUEST><SERVICE_CODE>XIEHE|OP0003</SERVICE_CODE><OP_ANESTHESIA><BID>-230647198944067584</BID><PATIENT_ID>49424362</PATIENT_ID><INHOS_TIMES>50183659</INHOS_TIMES><OP_APPLY_NO>852091</OP_APPLY_NO><OP_RECORD_NO></OP_RECORD_NO><EVENT_NO>-230664153478463488</EVENT_NO><ITEM_CLASS>11</ITEM_CLASS><ITEM_NAME>备药 阿托品0.5mg,麻黄碱30mg</ITEM_NAME><DOSAGE></DOSAGE><DOSAGE_UNITS></DOSAGE_UNITS><ADMINISTARTION></ADMINISTARTION><START_TIME>2023/7/17 11:25:00</START_TIME><END_TIME>2023/7/17 12:17:00</END_TIME></OP_ANESTHESIA></REQUEST></string>]]><![CDATA[<string><REQUEST><SERVICE_CODE>XIEHE|OP0003</SERVICE_CODE><OP_ANESTHESIA><BID>-230647198944067584</BID><PATIENT_ID>49424362</PATIENT_ID><INHOS_TIMES>50183659</INHOS_TIMES><OP_APPLY_NO>852091</OP_APPLY_NO><OP_RECORD_NO></OP_RECORD_NO><EVENT_NO>-230664154745143296</EVENT_NO><ITEM_CLASS>11</ITEM_CLASS><ITEM_NAME>气管插管使用奥布卡因凝胶润滑</ITEM_NAME><DOSAGE></DOSAGE><DOSAGE_UNITS></DOSAGE_UNITS><ADMINISTARTION></ADMINISTARTION><START_TIME>2023/7/17 11:35:00</START_TIME><END_TIME>2023/7/17 12:17:01</END_TIME></OP_ANESTHESIA></REQUEST></string>]]><![CDATA[<string><REQUEST><SERVICE_CODE>XIEHE|OP0003</SERVICE_CODE><OP_ANESTHESIA><BID>-230647198944067584</BID><PATIENT_ID>49424362</PATIENT_ID><INHOS_TIMES>50183659</INHOS_TIMES><OP_APPLY_NO>852091</OP_APPLY_NO><OP_RECORD_NO></OP_RECORD_NO><EVENT_NO>-230664190749048832</EVENT_NO><ITEM_CLASS>1</ITEM_CLASS><ITEM_NAME>左侧桡动脉穿刺置管</ITEM_NAME><DOSAGE></DOSAGE><DOSAGE_UNITS></DOSAGE_UNITS><ADMINISTARTION></ADMINISTARTION><START_TIME>2023/7/17 11:45:00</START_TIME><END_TIME>2023/7/17 12:17:09</END_TIME></OP_ANESTHESIA></REQUEST></string>]]><![CDATA[<string><REQUEST><SERVICE_CODE>XIEHE|OP0003</SERVICE_CODE><OP_ANESTHESIA><BID>-230647198944067584</BID><PATIENT_ID>49424362</PATIENT_ID><INHOS_TIMES>50183659</INHOS_TIMES><OP_APPLY_NO>852091</OP_APPLY_NO><OP_RECORD_NO></OP_RECORD_NO><EVENT_NO>-230664242460622848</EVENT_NO><ITEM_CLASS>1</ITEM_CLASS><ITEM_NAME>拔除动脉置管</ITEM_NAME><DOSAGE></DOSAGE><DOSAGE_UNITS></DOSAGE_UNITS><ADMINISTARTION></ADMINISTARTION><START_TIME>2023/7/17 16:00:00</START_TIME><END_TIME>2023/7/17 12:17:21</END_TIME></OP_ANESTHESIA></REQUEST></string>]]>";
//        String regex = "<!\\[CDATA\\[(.*?)\\]\\]>"; // 正则表达式，匹配以 <![CDATA[ 开始、以 ]]> 结束的内容
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//
//        while (matcher.find()) {
//            String cdataContent = matcher.group(1);
//            System.out.println(cdataContent);
//            System.out.println("----------");
//        }

//        List<String> records = extractRecordsFromCData(input);
//        String formattedOutput = formatRecords(records);
//        System.out.println(formattedOutput);

        // 使用正则表达式去除CDATA标签
        String withoutCData = input.replaceAll("<!\\[CDATA\\[|]]>", "");

        // 使用正则表达式提取OP_ANESTHESIA标签内容
        String extractedData = extractOPAnesthesia(withoutCData);

        // 拼接为完整的XML结构
        String finalOutput = "<string><REQUEST><SERVICE_CODE>XIEHE|OP0003</SERVICE_CODE>" + extractedData + "</REQUEST></string>";

        System.out.println(finalOutput);
    }

    private static String extractOPAnesthesia(String data) {
        // 使用正则表达式匹配OP_ANESTHESIA标签的内容
        String regex = "(<OP_ANESTHESIA>.*?</OP_ANESTHESIA>)";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(data);

        // 拼接匹配到的结果为一个完整的XML结构
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group());
        }

        return result.toString();
    }

    private static String extractOuterStringElements(String data) {
        // 使用正则表达式匹配开头的<string>元素和结尾的</REQUEST></string>元素
        String regex = "(<string><REQUEST>.*?</REQUEST></string>)";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(data);

        // 拼接匹配到的结果为最终输出
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append("\n");
        }

        return result.toString();
    }

    private static String removeIntermediateTags(String data) {
        // 使用正则表达式匹配中间元素的标签并替换为空字符串
        // 这里假设中间元素的标签为<REQUEST>和</REQUEST>，你可以根据具体的数据结构来修改正则表达式
        String regex = "(?<=<REQUEST>).*?(?=</REQUEST>)";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(data);
        return matcher.replaceAll("");
    }

    private static List<String> extractRecordsFromCData(String data) {
        List<String> records = new ArrayList<>();
        Pattern cdataPattern = Pattern.compile("<!\\[CDATA\\[(.*?)]]>", Pattern.DOTALL);
        Matcher matcher = cdataPattern.matcher(data);

        while (matcher.find()) {
            records.add(matcher.group(1));
        }

        return records;
    }

    private static String formatRecords(List<String> records) {
        StringBuilder formattedData = new StringBuilder();
        for (String record : records) {
            formattedData.append(record).append("\n");
        }
        return formattedData.toString();
    }
}
