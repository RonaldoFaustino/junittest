package org.JunitTest.atividade4;

import org.JunitTest.atividade1.Teste1;
import org.JunitTest.atividade2.TesteComAsserNullAssertNotNullAsssertArrayEquals;
import org.JunitTest.atividade2.TesteComAssertThat;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@Categories.IncludeCategory({Smoke.class,Regressivo.class})
@Categories.ExcludeCategory()
@Suite.SuiteClasses({TesteComAsserNullAssertNotNullAsssertArrayEquals.class, TesteComAssertThat.class, Teste1.class})
public class SuiteTeste {


}
