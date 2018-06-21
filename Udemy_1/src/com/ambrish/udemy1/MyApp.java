package com.ambrish.udemy1;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach coach = new FootballCoach();
		Coach coach2 = new CricketCoach();
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
	}

}
