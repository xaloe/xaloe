package com.xaloe.designpattern.prototype.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.xaloe.designpattern.prototype.AdvTemplate;
import com.xaloe.designpattern.prototype.Mail;
/**
 * 
 * TODO (发送邮件)
 * <p> </p>
 * @author xie_zhibing@163.com
 *
 */
public class MailTest {

	@Test
	public void testClone(){
		Mail mail = new Mail(new AdvTemplate());
		mail.setAdvUrlList(initAdvUrlList());
		
		for(int i = 0; i < 1000; i++){
			Mail mailClone = mail.clone();
			String randomName = randomName();
			mailClone.setApellation(randomName + "女士/先生");
			mailClone.setReceiver(randomName + "@luckytravel.com");
			if(i%2 == 1){
				mailClone.getAdvUrlList().add("http://www.luckytravel.com/adv/6");
			}
			sendMail(mailClone);
		}
	}
	
	/**
	 * 发送邮件
	 * @param mail
	 */
	private void sendMail(Mail mail){
		System.out.println("标题："+mail.getSubject() + " 收件人: "+mail.getReceiver() + " 发送成功!");
		System.err.println("其他广告： "+mail.getAdvUrlList());
		System.out.println();
	}
	
	/**
	 * 初始化广告推广地址
	 * @return
	 */
	private ArrayList<String> initAdvUrlList(){
		List<String> list = Arrays.asList(
				"http://www.luckytravel.com/adv/1",
				"http://www.luckytravel.com/adv/2",
				"http://www.luckytravel.com/adv/3",
				"http://www.luckytravel.com/adv/4",
				"http://www.luckytravel.com/adv/5");
		ArrayList<String> advUrlList = new ArrayList<String>();
		advUrlList.addAll(list);
		return advUrlList;
	}
	
	/**
	 * 随机名称
	 * @return
	 */
	private String randomName(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
