testng-tests-reordering
=======================

Run mvn clean test

You will see something like
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
================
MyMethodInterceptor.intercept called with methods:
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
After reordering
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
================
================
MyMethodInterceptor.intercept called with methods:
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
After reordering
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
================
Test1.test1_2
Test1.test1_1
================
MyMethodInterceptor.intercept called with methods:
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
After reordering
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
================
Test2.test2_2
Test2.test2_1
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.282 sec
```

Expected something like
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
================
MyMethodInterceptor.intercept called with methods:
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
After reordering
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
================
================
MyMethodInterceptor.intercept called with methods:
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
After reordering
    [MethodInstance method=Test2.test2_2()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
    [MethodInstance method=Test2.test2_1()[pri:0, instance:tests.Test2@11d1f39a] instance=tests.Test2@11d1f39a]
================
Test2.test2_2
Test2.test2_1
================
MyMethodInterceptor.intercept called with methods:
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
After reordering
    [MethodInstance method=Test1.test1_2()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
    [MethodInstance method=Test1.test1_1()[pri:0, instance:tests.Test1@65640941] instance=tests.Test1@65640941]
================
Test1.test1_2
Test1.test1_1
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.271 sec
```