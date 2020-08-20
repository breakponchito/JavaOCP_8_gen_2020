package com.cert.ocp8.course.deveduardodogs.module6.practice3;

public class AnalyzerTool {
  
  public void showResult(String[] strList, String searchStr, StringAnalyzer analyzer){
    for(String current:strList){
      if (analyzer.analyze(current, searchStr)){
        System.out.println("Match: " + current);
      }
    }
  }
}
