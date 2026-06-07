package com.learn.aop.demo_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/***
 * 1. The class annotated with @Aspect is an aspect which handles cross cutting concerns.</br>
 * 2. @Before @After @Around @AfterReturning and @AfterThrowing are Advices. 
 * Corresponding annotated methods will be executed accordingly.</br>
 * 3. Argument in the Advice methods are the @PointCut expressions.
 * The expressions determine where the Advice execution point will be mapped for execution.</br>
 * 4. The argument of the implemented method accepts a JoinPoint and it determines the point 
 * where the Advice method and the method in execution are joined together for invoking advice method.
 * 5. The argument have various types, "execution" is used most commonly.
 * 6. Syntax, "execution(* com.learn.aop.demo_aop..*.*(..))" signifies,
 * 	a. First * signifies access modifier(public/private etc. * means all)
 *  b. Second package,  com.learn.aop.demo_aop..* signifies all classes inside demo_aop directory and sub-directories.
 *  c. Third, ..*.* signifies all methods inside those classes.
 *  d. Fourth, (..) indicates any number or arguments/types inside those methods.
 * 7. If more than one advice has same joint point, then, more generic is executed first and then, in order.
 */
@Aspect
@Component
public class DemoAspect {

	@Before("execution(* com.learn.aop.demo_aop..*.*(..))")
	public void beforeAnyMethodExecution(JoinPoint joinPoint) {
		System.out.println("Inside beforeAnyMethodExecution for method "+joinPoint.getSignature());
	}
	
	@Before("execution(* com.learn.aop.demo_aop.service.OrderService.processPayment(String))")
	public void beforeOrderPaymentMethodExecution(JoinPoint joinPoint) {
		System.out.println("Inside beforeOrderPaymentMethodExecution for method "+joinPoint.getSignature());
	}
	
}
