package com.Memory;
/**
* @author Memory
* @version ����ʱ�䣺2020-10-14 16:59:28
* ��˵��
*/

import java.util.Scanner;

/**
* @author Memory
* @version ����ʱ�䣺2020-10-14 16:08:44
* ��˵��
*/
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ѡ��Ҫ���еĲ�����1. ��� 2. ȡ�� 3. ��ѯ 4. ��ʾ�˻� 5. �˳�");
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
			System.out.println("��ѡ��Ҫ���еĲ�����1. ��� 2. ȡ�� 3. ��ѯ 4. ��ʾ�˻� 5. �˳�");
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
	//���
	public void deposit() {
		System.out.println("������Ҫ����Ľ���������");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		this.balance += money;
		System.out.println("���ɹ����Ѵ��� " + money + "Ԫ�������Ϊ" + this.balance + "Ԫ");
	}
	//ȡ��
	public void withdrawal() {
		System.out.println("������Ҫȡ���Ľ���������");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		this.balance -= money;
		System.out.println("ȡ��ɹ�����ȡ�� " + money + "Ԫ�������Ϊ" + this.balance + "Ԫ");
	}
	//��ѯ���
	public void check_balance() {
		System.out.println("�������:" + this.balance);
	}
	//��ʾ�˻���Ϣ
	public void show_account() {
		System.out.println("�˺�:" + this.account);
		System.out.println("����:" + this.name);
		System.out.println("����ʱ��:" + this.opentime);
		System.out.println("���֤��:" + this.id);
	}
}

