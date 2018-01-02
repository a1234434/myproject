package com.Judy.oo;

//有要研究生成績的需求,但又與Student那個有共同的成績需要(英,數,國),研究生多了論文成績需求
public class GraduateStudent extends Student{
	 int thesis;
     public GraduateStudent(){
 // super();這個只能放在第一行,不然不能執行
           super();
     }
	@Override//(覆寫) 
	public void print() {
//這裡的debug的話,會進入Student裏頭的print那裏,Debug的時候要按Step into,才會跑進去	
		super.print();
		System.out.println(english + "\t" + math + "\t" + chinese + "\t"+thesis);

	}
	
	
}
