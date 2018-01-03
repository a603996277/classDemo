package about_aodong_cn;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class RedXml
{

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder doc=factory.newDocumentBuilder();
            try {
                Document document=doc.parse(new File("test.xml"));//这里就是读取代码，调用parse方法
                Element root=document.getDocumentElement();//获取它的根节点的信息,返回值是Element;
                NodeList list=root.getElementsByTagName("lan");//获取属性值为lan的值。返回值是列表
                if (null!=list) {
					System.out.println("lanyouzhi");
				}
                System.out.println("cat="+root.getAttribute("cat"));
                for (int i = 0; i < list.getLength(); i++) {
                    Element lan=(Element) list.item(i);//通过循环获取列表中的值
                    System.out.println("-----------");
                    System.out.println("id="+lan.getAttribute("id"));//通过getAttribute获取属性的值

//                  Element name=(Element) lan.getElementsByTagName("name").item(0);
//                  System.out.println("name="+name.getTextContent());
                    NodeList Child=lan.getChildNodes();//获取lan标签的下面的标签的列表
                    for (int j = 0; j < Child.getLength(); j++) {
                        Node c= Child.item(j);
                        if(c instanceof Element ){
                            System.out.println(c.getNodeName()+"="+c.getTextContent());
                        }

                    }

                }
            } catch (SAXException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {

            e.printStackTrace();
        }

    }

}
