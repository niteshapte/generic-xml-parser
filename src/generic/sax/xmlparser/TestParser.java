package generic.sax.xmlparser;

import com.google.common.collect.ListMultimap;
 
public class TestParser {
 
        public static void main(String[] args) {                
 
                String xml = "<response><item><checkpoint_01><id>x_1</id><city>city_name_a</city><province>province_name_a</province><country>country_name_a</country></checkpoint_01><checkpoint_02><id>x_2</id><city>city_name_b</city><province>province_name_b</province><country>country_name_b</country></checkpoint_02><checkpoint_03><id>x_1</id><city>city_name_c</city><province>province_name_c</province><country>country_name_c</country></checkpoint_03></item></response>";
 
                if(xml == null || xml == "") {
                        System.out.println("Nothing");
			System.exit(1);
                }
 
                GenericXMLParserSAX genericXMLParserSAX = new GenericXMLParserSAX();
                String[] startElement = {"check"};
                String[] endElement = {"id", "city", "province"};
 
                genericXMLParserSAX.parseDocument(xml, startElement, endElement);
 
                ListMultimap<String, String> xmlData  = genericXMLParserSAX.multiSetResult();
 
                System.out.println(xmlData.toString());
                System.out.println("<<================");
 
                for(int i = 0; i < xmlData.get("check").size(); i++) {                       
                        System.out.println(xmlData.get("check").get(i) + " = id => " + xmlData.get("id").get(i));
                        System.out.println(xmlData.get("check").get(i) + " = city => " + xmlData.get("city").get(i));
                        System.out.println(xmlData.get("check").get(i) + " = province => " + xmlData.get("province").get(i));                        
                }
 
                System.out.println("==================>>");
        }
}
