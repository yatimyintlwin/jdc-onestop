package com.jdc.app;

// import com.jdc.app.domain.*;
// exclude sub class
import com.jdc.app.domain.Student;
import com.jdc.app.domain.Parent;

// import static com.jdc.app.utils.MessageUtils.*;
import static com.jdc.app.utils.MessageUtils.MESSAGE;
import static com.jdc.app.utils.MessageUtils.sayHello;

import static com.jdc.app.utils.Others.*;

public class Application {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.sayHello();

		Student s = new Student();
		s.sayHello();

		Parent p = new Parent();
		p.sayHello();

		System.out.println(MESSAGE);

		sayHello();

		System.out.println("Hello My first Package");
	}
}