package mocks.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestLogAnalyzer{

  @Test 
  public void test1(){
    IWebService webService = createMock(IWebService.class);
    IEmailService emailService = createMock(IEmailService.class);

    replay(webService,emailService);

    LogAnalyzer log = new LogAnalyzer();
    log.setWebService(webService);
    log.setEmailService(emailService);
    String fileName = "federico";
    log.analyze(fileName);

    verify(webService,emailService);

    reset(webService,emailService);
  }

  @Test 
  public void test2(){
    String fileName = "federic";
    IEmailService emailService = createMock(IEmailService.class);
    IWebService webService = createMock(IWebService.class);
    webService.logError("Filename too short:" + fileName);
    expectLastCall();

    replay(emailService,webService);

    LogAnalyzer log = new LogAnalyzer();
    log.setEmailService(emailService);
    log.setWebService(webService);
    log.analyze(fileName);

    verify(emailService,webService);

    reset(emailService,webService);
  }

  @Test 
  public void test3(){
    String fileName = "federic";

    IEmailService emailService = createMock(IEmailService.class);
    IWebService webService = createMock(IWebService.class);

    webService.logError("Filename too short:" + fileName);
    expectLastCall().andThrow(new RuntimeException("error"));
    emailService.sendEmail("a","subject","error");
    expectLastCall();

    replay(emailService,webService);

    LogAnalyzer log = new LogAnalyzer();
    log.setWebService(webService);
    log.setEmailService(emailService);
    log.analyze(fileName);

    verify(emailService,webService);

    reset(emailService,webService);
  }

}

