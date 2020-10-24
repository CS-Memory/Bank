package com.Memory;
/**
* @author Memory
* @version 创建时间：2020-10-14 16:59:28
* 类说明
*/

import java.util.Scanner;

/**
* @author Memory
* @version 创建时间：2020-10-14 16:08:44
* 类说明
*/
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请选择要进行的操作：1. 存款 2. 取款 3. 查询 4. 显示账户 5. 退出");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		UserInfo user = new UserInfo(1111,"zhangsan",2000,"Sun Feb 01 00:00:00 CST 2009","2222");
		while(n != 5) {
			
			switch(n) {
				case 1:
					user.deposit();
					break;
				case 2:
					user.withdrawal();
					break;
				case 3:
					user.check_balance();
					break;
				case 4:
					user.show_account();
					break;
				case 5:
					return;	
			}
			System.out.println("请选择要进行的操作：1. 存款 2. 取款 3. 查询 4. 显示账户 5. 退出");
			n = sc.nextInt();
		}
	}
}
class UserInfo {
	public int account;
	public String name;
	public int balance;
	public String opentime;
	public String id;
	
	public UserInfo(int account,String name,int balance,String opentime,String id) {
		this.account = account;
		this.name = name;
		this.balance = balance;
		this.opentime = opentime;
		this.id = id;
	}
	//存款
	public void deposit() {
		System.out.println("请输入要存入的金额（整数）：");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		this.balance += money;
		System.out.println("存款成功！已存入 " + money + "元可用余额为" + this.balance + "元");
	}
	//取款
	public void withdrawal() {
		System.out.println("请输入要取出的金额（整数）：");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		this.balance -= money;
		System.out.println("取款成功！已取出 " + money + "元可用余额为" + this.balance + "元");
	}
	//查询余额
	public void check_balance() {
		System.out.println("您的余额:" + this.balance);
	}
	//显示账户信息
	public void show_account() {
		System.out.println("账号:" + this.account);
		System.out.println("姓名:" + this.name);
		System.out.println("开户时间:" + this.opentime);
		System.out.println("身份证号:" + this.id);
	}
}

