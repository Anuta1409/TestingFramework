package testCase1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * обьединение тестов всех тестов кейсов  в один тест сьют
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AssemptionAnderstanding.class, TestFirst.class, TestSecond.class})
public class MyTestSuiteRunner {

}
