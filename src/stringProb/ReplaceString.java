package stringProb;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ReplaceString {

	@Test
	public void test(){
	Assert.assertEquals("  I%20am%20pushpak", ReplaceSpace.replace("I am pushpak"));
	}

}
