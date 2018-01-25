package com.pawan.design.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.pawan.design.bean.Employee;

public class DOMParserTest {
	
	public static void main(String[] args) {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Document document = null;
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
		    document = builder.parse(ClassLoader.getSystemResourceAsStream("test.xml"));
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		NodeList nodeList = document.getDocumentElement().getChildNodes();
		List<Employee> employeeList = new ArrayList<Employee>();
		for(int i=0;i<nodeList.getLength();i++) {
			Node pNode = nodeList.item(i);
			Employee emp = null;
			if(pNode instanceof Element) {
				emp = new Employee();
				emp.setId(pNode.getAttributes().getNamedItem("id").getNodeValue());
			}
			
			NodeList childNodes = pNode.getChildNodes();
			for(int j=0;i<childNodes.getLength();j++) {
				Node cNode = childNodes.item(j);
				if(cNode instanceof Element) {
					String content = cNode.getLastChild().getTextContent().trim();
					String name = cNode.getNodeName();
					switch(name) {
					
					case "firstName" :
						emp.setFirstName(content);
						break;
					case "lastName" :
						emp.setLastName(content);
						break;
					case "location" :
						emp.setLocation(content);
						break;
					default:
						break;
						  
					}
				}
			}
		}
		
		//employeeList.parallelStream().map(employee -> System.out.println(employee.getFirstName()+" "+employee.getId()));
		for(Employee employee : employeeList) {
			System.out.println(employee);
		}
	}

}
