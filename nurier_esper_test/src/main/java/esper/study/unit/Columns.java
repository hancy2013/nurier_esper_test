package esper.study.unit;

import java.util.ArrayList;
 
import java.util.List;
 
import java.util.StringTokenizer;
 
 
 
public class Columns {
 
 List<String> tokens = null;
 
 

 public Columns() {
 
  if(tokens == null) {
 
   tokens = new ArrayList<String>();
 
  }
 
 }
 
 

 public Columns withCSV(String csvLine) {
 
  String tempString;
 
  

  if(tokens == null) {
 
   tokens = new ArrayList<String>();
 
  }
 
 
 
  StringTokenizer token = new StringTokenizer(csvLine, ",");
 
  while (token.hasMoreTokens()) {
 
   tempString = token.nextToken();
 
   if (tempString.length() > 0) {
 
    tokens.add(tempString.trim());
 
   }
 
  }
 
  

  return this;
 
 }
 
 

 public void add(String token) {
 
  tokens.add(token);
 
 }
 
 

 public List<String> getTokens() {
 
  return tokens;
 
 }
 
 

 public String toCSV() {
 
  StringBuffer line = new StringBuffer();
 
  for(int i = 0 ; i < tokens.size() ; i++) {
 
   if(i != tokens.size() -1)
 
    line.append(tokens.get(i)).append(",");
 
   else
 
    line.append(tokens.get(i));
 
  }
 
  

  return line.toString();
 
 }
 
 
}


