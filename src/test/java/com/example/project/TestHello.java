package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestHello {

	static Bag b;

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		b = new Bag();
	}

	@Test
	void testAdd()
	{
		Random rand = new Random();

		for (int i = 0; i < 10; i++)
		{
			int item = rand.nextInt();

			b.add(item);
			assertTrue(b.contains(item));
		}
		assertTrue(b.size() == 10);
	}
   
	@Test
	void testContains()
	{
		fail("Not yet implemented"); // TODO
	}

}
