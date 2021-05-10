package cn.lujango.aviator;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lujango
 * @Date: 2021/5/10 10:28 上午
 */
public class AviatorMain {

  public static void main(String[] args) {
    String expression = "a + b + c";
    String expression2 = "a>b";
    String expression3 = "GC=='MS00'&&WLLX=='Z014'&&PLM=='A'";
    String expression4 = "'MS00;MS01;MS02'.indexOf(GC)";
    String expression5 = "string.contains('MS00;MS01;MS02',GC)";
    String expression6 = "string.indexOf('MS00;MS01;MS02',GC)";

    Map<String, Object> params = new HashMap<>();
    params.put("GC", "MS00");
    params.put("WLLX", "Z015");
    params.put("PLM", "A");
    params.put("PLM1", "B");
    params.put("PLM2", "C");
    params.put("PLM3", "D");
    Expression compiledExp = AviatorEvaluator.compile(expression3);

    long time1 = System.currentTimeMillis();
    // Object result = AviatorEvaluator.execute(expression1, params);

    Object result = AviatorEvaluator.execute(expression3, params);
    System.out.println("result:"+result);

   /* for (int i = 0; i < 10000; i++) {
      Object result1 = compiledExp.execute( params);
      //Object result = AviatorEvaluator.execute(expression1, params);
    }*/
    long time2 = System.currentTimeMillis();
    System.out.println(time2-time1);
  }
}
