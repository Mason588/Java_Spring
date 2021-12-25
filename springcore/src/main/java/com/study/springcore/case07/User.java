package com.study.springcore.case07;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//在配置文件中有設定<context:include-filter type="assignable" expression="com.study.springcore.case07.User"/>
//則此類別可以不用加註 @Component
//@Component
public class User {
	@Value(value="香奈乎")
			private String name;
	public Map<Integer, String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(Map<Integer, String> hobbies) {
		this.hobbies = hobbies;
	}


	@Value(value="16")
			private Integer age;
	
	@Value("#{${nicknames:{'小蝴蝶','天然呆'}}}")  //Spring EL
	private String[] nicknames;
	
	
	@Value("#{${subjects:{'劍法', '呼吸法', '戰術'}}}") 
	private Set<String> subjects;
	
	@Value("#{${scores:{'100', '100', '100'}}}") 
	private List<Integer> scores;
	
	@Value("#{${hobbies:{1:'擲硬幣',2:'吃餅乾'}}}") 
	private Map<Integer, String> hobbies;
	
	public List<Integer> getScores() {
		return scores;
	}


	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}


	public String[] getNicknames() {
		return nicknames;
	}
	
	
	private Set<String> getSubjects() {
		return subjects;
	}


	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}


	public void setNicknames(String[] nicknames) {
		this.nicknames = nicknames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", nicknames=" + Arrays.toString(nicknames) + ", subjects="
				+ subjects + ", scores=" + scores + ", hobbies=" + hobbies + "]";
	}
	
}
