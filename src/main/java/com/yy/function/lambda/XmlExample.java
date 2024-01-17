package com.yy.function.lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gongcy
 * @date 2023/6/28 5:05 下午
 * @Description
 */
public class XmlExample {

    public static void main(String[] args) {
        String xml = "\"<![CDATA[<string><REQUEST><SERVICE_CODE>XIEHE|OP0001</SERVICE_CODE><OP_INFO><BID>-155294978501771264</BID><PATIENT_ID>48395403</PATIENT_ID><INHOS_TIMES>47044908</INHOS_TIMES><OP_APPLY_NO>788674</OP_APPLY_NO><OP_RECORD_NO>107731</OP_RECORD_NO><OP_DTIME>2022/12/22 8:00:00</OP_DTIME><OP_DOCT_ID>10126</OP_DOCT_ID><OP_DOCT_NAME>顾宇        </OP_DOCT_NAME><OP_ANES_DOCT_ID>11719</OP_ANES_DOCT_ID><OP_ANES_DOCT_NAME>王维嘉</OP_ANES_DOCT_NAME><OP_ASS_DOCT_ID_1>11257</OP_ASS_DOCT_ID_1><OP_ASS_DOCT_NAME_1>梁硕</OP_ASS_DOCT_NAME_1><OP_ASS_DOCT_ID_2></OP_ASS_DOCT_ID_2><OP_ASS_DOCT_NAME_2>          </OP_ASS_DOCT_NAME_2><OP_ASS_DOCT_ID_3></OP_ASS_DOCT_ID_3><OP_ASS_DOCT_NAME_3></OP_ASS_DOCT_NAME_3><OP_ASS_DOCT_ID_4></OP_ASS_DOCT_ID_4><OP_ASS_DOCT_NAME_4></OP_ASS_DOCT_NAME_4><OP_BEGIN_DTIME>2022/12/22 8:56:00</OP_BEGIN_DTIME><OP_END_DTIME>2022/12/22 10:15:00</OP_END_DTIME><OP_CODE></OP_CODE><OP_NAME>腹腔镜子宫双附件切除+前哨淋巴结活检</OP_NAME><PART_CODE></PART_CODE><PART_NAME></PART_NAME><OP_LEVEL></OP_LEVEL><OP_POSE>截石位</OP_POSE><OP_DETAIL></OP_DETAIL><OP_ASEP_FLAG></OP_ASEP_FLAG><OP_COMO_FLAG></OP_COMO_FLAG><OP_COMP_FLAG></OP_COMP_FLAG><OP_DEPT_CODE>307</OP_DEPT_CODE><OP_DEPT_NAME></OP_DEPT_NAME><OP_DOCT_DEPT_CODE>ZLFKZXLCAZDYPT-妇科肿瘤中心卵巢癌组（东院）（普通）</OP_DOCT_DEPT_CODE><OP_DOCT_DEPT_NAME>ZLFKZXLCAZDYPT-妇科肿瘤中心卵巢癌组（东院）（普通）</OP_DOCT_DEPT_NAME><STAY_DEPT_CODE></STAY_DEPT_CODE><STAY_DEPT_NAME></STAY_DEPT_NAME><OP_SECOND_FLAG></OP_SECOND_FLAG><ISOLATION_FLAG></ISOLATION_FLAG><ANES_WAY_CODE></ANES_WAY_CODE><ANES_WAY_NAME>全身麻醉</ANES_WAY_NAME><INCI_LEVEL_CODE></INCI_LEVEL_CODE><INCI_LEVEL_NAME></INCI_LEVEL_NAME><HEAL_LEVEL_CODE></HEAL_LEVEL_CODE><HEAL_LEVEL_NAME></HEAL_LEVEL_NAME><HEAL_DETAIL></HEAL_DETAIL><PRE_DIAG_CODE></PRE_DIAG_CODE><PRE_DIAG_NAME></PRE_DIAG_NAME><AFTER_DIAG_CODE></AFTER_DIAG_CODE><AFTER_DIAG_NAME></AFTER_DIAG_NAME><OP_ROOM></OP_ROOM><OP_ROOM_NO>307</OP_ROOM_NO><OP_SEQUENCE>1</OP_SEQUENCE><BE_OP_BLD_SELF></BE_OP_BLD_SELF><OP_BLD_COLLECT></OP_BLD_COLLECT><OP_BLD_SELF></OP_BLD_SELF><OP_BLD_LOSE></OP_BLD_LOSE><TOTAL_OUTPUT>100</TOTAL_OUTPUT><TOTAL_INPUT>1200</TOTAL_INPUT></OP_INFO></REQUEST></string>]]>\"";
        String res = getFormattedData(xml);
        System.out.println("处理后的字符串: " + res);

    }

    private static String getFormattedData(String xml) {
        if (xml.matches("^<string.*>$")) {
            return xml;
        }
        String processedString = xml.replaceAll("^\"<!\\[CDATA\\[\"|\"]]>\",?|\"$", "");
        Pattern cdataPattern = Pattern.compile("<!\\[CDATA\\[(.*?)]]>", Pattern.DOTALL);
        Matcher matcher = cdataPattern.matcher(processedString);
        if (matcher.find()) {
            return matcher.group(1);
        }

        return processedString;

    }
}
