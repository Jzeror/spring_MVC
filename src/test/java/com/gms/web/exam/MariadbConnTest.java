package com.gms.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MariadbConnTest {
	@Test
	public void test() {
		MariadbConn m = new MariadbConn();
		assertEquals("RYU", m.exam());
	}
}
