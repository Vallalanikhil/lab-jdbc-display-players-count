package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public TreeMap<Integer, Skill> skillCount() throws Exception{
		
		TreeMap<Integer, Skill> treemap = new TreeMap<Integer, Skill>();
		
		Connection cn=ConnectionManager.getConnection();
		PreparedStatement ps= cn.prepareStatement(" ");
		String sql="select * from player_p";
		
		ResultSet sc=ps.executeQuery(sql);
		
		int batting=0;
		int allrounder=0;
		int bowling=0;
		while(sc.next()) {
			if(sc.getInt(4)==1) {
				 System.out.println("check1 :"+ sc.getLong(4));
				 batting++;
			}
			 else if(sc.getInt(4)==2) {
				 allrounder++;
				 System.out.println("check2 :"+ sc.getLong(4));
			 }
			 else if(sc.getInt(4)==3){
				 bowling++;
				 System.out.println("check3 :"+ sc.getLong(4));
			 }
		}
		 Skill s1=new Skill(1,"batting");
		 Skill s2=new Skill(2,"allrounder");
		 Skill s3=new Skill(3,"bowling");
		
		 treemap.put(batting,s1);
		 treemap.put(allrounder,s2);
		 treemap.put(bowling,s3);
		
		return treemap;
		
	}
}
