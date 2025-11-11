package mocks.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestIPBlackList{

  @Test 
  public void test1(){
    String ip = "192.168.0.1";
    String userName = "fede";
    String password1 = "independiente";
    String password2 = "racing";
    String password1Hash = Utils.getPasswordHashMD5(password1);
    String password2Hash = Utils.getPasswordHashMD5(password2);

    LoginService loginService = createMock(LoginService.class);

    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);
    expect(loginService.login(ip,userName,password2Hash)).andReturn(true);

    replay(loginService);

    IPBlacklist ipBlackList = new IPBlacklist();
    ipBlackList.setService(loginService);

    assertFalse(ipBlackList.login(ip,userName,password1));
    assertTrue(ipBlackList.login(ip,userName,password2));

    verify(loginService);

    reset(loginService);
  }

  @Test 
  public void test2(){
    String ip = "192.168.0.1";
    String userName = "fede";
    String password1 = "independiente";
    String password1Hash = Utils.getPasswordHashMD5(password1);

    LoginService loginService = createMock(LoginService.class);

    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);
    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);
    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);

    replay(loginService);

    IPBlacklist ipBlackList = new IPBlacklist();
    ipBlackList.setService(loginService);

    assertFalse(ipBlackList.login(ip,userName,password1));
    assertFalse(ipBlackList.login(ip,userName,password1));
    assertFalse(ipBlackList.login(ip,userName,password1));
    assertTrue(ipBlackList.blacklisted(ip));

    verify(loginService);

    reset(loginService);
  }

  @Test 
  public void test3(){
    String ip = "192.168.0.1";
    String userName = "fede";
    String password1 = "independiente";
    String password1Hash = Utils.getPasswordHashMD5(password1);

    LoginService loginService = createMock(LoginService.class);

    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);
    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);

    replay(loginService);

    IPBlacklist ipBlackList = new IPBlacklist();
    ipBlackList.setService(loginService);

    assertFalse(ipBlackList.login(ip,userName,password1));
    assertFalse(ipBlackList.login(ip,userName,password1));
    assertFalse(ipBlackList.blacklisted(ip));

    verify(loginService);

    reset(loginService);
  }

  @Test 
  public void test4(){
    String ip = "192.168.0.1";
    String userName = "fede";
    String password1 = "independiente";
    String password1Hash = Utils.getPasswordHashMD5(password1);

    LoginService loginService = createMock(LoginService.class);

    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);
    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);
    expect(loginService.login(ip,userName,password1Hash)).andReturn(false);

    replay(loginService);

    IPBlacklist ipBlackList = new IPBlacklist();
    ipBlackList.setService(loginService);

    assertFalse(ipBlackList.login(ip,userName,password1));
    assertFalse(ipBlackList.login(ip,userName,password1));
    assertFalse(ipBlackList.login(ip,userName,password1));
    assertFalse(ipBlackList.login(ip,userName,password1));

    assertTrue(ipBlackList.blacklisted(ip));

    verify(loginService);

    reset(loginService);
  }


}
