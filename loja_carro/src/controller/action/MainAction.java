package controller.action;

import com.opensymphony.xwork2.Preparable;

public class MainAction implements Preparable{
	
	protected static final String SUCCESS = "Success";
	
	public void prepare() {
		System.out.println("test");
		
	}
}
