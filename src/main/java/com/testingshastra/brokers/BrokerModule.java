package com.testingshastra.brokers;

public class BrokerModule {
	private void addBroker() {
		System.out.println("I'm Adding Broker.\nIn Masters-> Brokers");
	}
public static void main(String[] args) {
	new BrokerModule().addBroker();
}
}
