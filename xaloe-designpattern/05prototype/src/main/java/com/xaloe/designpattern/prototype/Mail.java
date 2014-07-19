package com.xaloe.designpattern.prototype;

import java.util.ArrayList;

/**
 * 
 * TODO (邮件)
 * <p>
 * 对于 <b>非final的</b> 基本类型byte, char, short, int, long, float, double, <br/>
 * boolean以及String类型成员变量，对象clone时会实现这些成员变量的完全拷贝，<br/>
 * 对于数组、引用类型的变量都不拷贝，还是指向成员变量引用地址。<br/>
 * 可通过编写代码的方式实现强制拷贝，达到深度拷贝的目的。<br/>
 * </p>
 * 
 * @author xie_zhibing@163.com
 * 
 */
public class Mail implements Cloneable {

	/** 称谓 */
	private String apellation;
	/** 收件人 */
	private String receiver;
	/** 邮件名称 */
	private String subject;
	/** 邮件内容 */
	private String context;
	/** 广告地址 */
	private ArrayList<String> advUrlList = new ArrayList<String>();
	
	public Mail(AdvTemplate advTemplate){
		this.subject = advTemplate.getSubject();
		this.context = advTemplate.getContext();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Mail clone() {
		// TODO Auto-generated method stub
		Mail mail = null;
		try {
			mail = (Mail)super.clone();
			//实现了advUrlList的clone，即实现了深拷贝
			mail.advUrlList = (ArrayList<String>)this.advUrlList.clone();				
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}


	public String getApellation() {
		return apellation;
	}

	public void setApellation(String apellation) {
		this.apellation = apellation;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public ArrayList<String> getAdvUrlList() {
		return advUrlList;
	}

	public void setAdvUrlList(ArrayList<String> advUrlList) {
		this.advUrlList = advUrlList;
	}

	
}
