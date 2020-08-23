package controller;

import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;

import model.Skill;

public class Main {

	public static void main(String[] args) throws Exception {

		SkillDAO SD=new SkillDAO();
		
		 TreeMap<Integer, Skill> treemap = new TreeMap<Integer, Skill>();
				
		 treemap=SD.skillCount();
				
			for(Entry<Integer, Skill> out: treemap.entrySet())
			{
				int id=out.getKey();
				Skill skill=out.getValue();
				System.out.println(skill.getSkillid()+"country   "+skill.getSkillName());
			}
			}
	}