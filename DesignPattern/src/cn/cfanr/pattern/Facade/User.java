package cn.cfanr.pattern.Facade;

/*
 * ??????????????????????????????????spring??????????????????????????????????��?????????????
 * ??????????????Facade???��??????????????????????????????�p?????
 * 
 * ??????????Computer???????CPU??Memory??Disk??????��?????????????????????????????????????????????
 * ??????????????????????????????????????????????Computer????????????????????Computer??????????
 * ??????????????????????????
 */
public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
