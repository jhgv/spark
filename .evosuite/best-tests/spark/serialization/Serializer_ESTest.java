/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 22 00:54:06 GMT 2018
 */

package spark.serialization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import spark.serialization.BytesSerializer;
import spark.serialization.DefaultSerializer;
import spark.serialization.InputStreamSerializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Serializer_ESTest extends Serializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      assertNotNull(bytesSerializer0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      assertNotNull(inputStreamSerializer0);
      
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.process(outputStream1, inputStreamSerializer0);
      bytesSerializer0.setNext(inputStreamSerializer0);
      bytesSerializer0.process(outputStream0, outputStream0);
      OutputStream outputStream2 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.processElement(outputStream2, "spark.serialization.BytesSerializer");
      boolean boolean0 = bytesSerializer0.canProcess((Object) null);
      assertFalse(boolean0);
      
      boolean boolean1 = bytesSerializer0.canProcess("");
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      
      InputStreamSerializer inputStreamSerializer1 = new InputStreamSerializer();
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
      assertNotNull(inputStreamSerializer1);
      
      String string0 = null;
      boolean boolean2 = inputStreamSerializer1.canProcess((Object) null);
      assertFalse(boolean2);
      assertNotSame(inputStreamSerializer1, inputStreamSerializer0);
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      assertNotNull(defaultSerializer0);
      
      OutputStream outputStream3 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      inputStreamSerializer1.processElement(outputStream3, defaultSerializer0);
      assertNotSame(inputStreamSerializer1, inputStreamSerializer0);
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
      
      OutputStream outputStream4 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.process(outputStream4, "spark.serialization.BytesSerializer");
      OutputStream outputStream5 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.processElement(outputStream5, (Object) null);
      OutputStream outputStream6 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream7 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.process(outputStream7, bytesSerializer0);
      defaultSerializer0.process(outputStream6, "");
      OutputStream outputStream8 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.process(outputStream8, "");
      OutputStream outputStream9 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.process(outputStream9, (Object) null);
      boolean boolean3 = inputStreamSerializer1.canProcess((Object) null);
      assertFalse(boolean3);
      assertNotSame(inputStreamSerializer1, inputStreamSerializer0);
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
      assertTrue(boolean3 == boolean1);
      assertTrue(boolean3 == boolean2);
      assertTrue(boolean3 == boolean0);
      
      OutputStream outputStream10 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultSerializer0.process(outputStream10, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      assertNotNull(inputStreamSerializer0);
      
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      assertNotNull(defaultSerializer0);
      
      inputStreamSerializer0.setNext(defaultSerializer0);
      boolean boolean0 = inputStreamSerializer0.canProcess("UOMxm[F`1``ph`;M;[");
      assertFalse(boolean0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        inputStreamSerializer0.process(outputStream0, outputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // $java.io.OutputStream$$EnhancerByMockitoWithCGLIB$$d32f4608 cannot be cast to java.io.InputStream
         //
         verifyException("spark.serialization.InputStreamSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      assertNotNull(bytesSerializer0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.process(outputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      assertNotNull(inputStreamSerializer0);
      
      boolean boolean0 = inputStreamSerializer0.canProcess("spark.serialization.InputStreamSerializer");
      assertFalse(boolean0);
      
      inputStreamSerializer0.processElement((OutputStream) null, (Object) null);
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      assertNotNull(bytesSerializer0);
      
      boolean boolean1 = bytesSerializer0.canProcess((Object) null);
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      
      bytesSerializer0.setNext(inputStreamSerializer0);
      // Undeclared exception!
      try { 
        inputStreamSerializer0.process((OutputStream) null, bytesSerializer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // spark.serialization.BytesSerializer cannot be cast to java.io.InputStream
         //
         verifyException("spark.serialization.InputStreamSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      assertNotNull(inputStreamSerializer0);
      
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      assertNotNull(defaultSerializer0);
      
      inputStreamSerializer0.setNext(defaultSerializer0);
      InputStreamSerializer inputStreamSerializer1 = new InputStreamSerializer();
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
      assertNotNull(inputStreamSerializer1);
      
      inputStreamSerializer0.setNext(inputStreamSerializer1);
      assertNotSame(inputStreamSerializer0, inputStreamSerializer1);
      assertNotSame(inputStreamSerializer1, inputStreamSerializer0);
      assertFalse(inputStreamSerializer0.equals((Object)inputStreamSerializer1));
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
      
      inputStreamSerializer0.setNext(inputStreamSerializer1);
      assertNotSame(inputStreamSerializer0, inputStreamSerializer1);
      assertNotSame(inputStreamSerializer1, inputStreamSerializer0);
      assertFalse(inputStreamSerializer0.equals((Object)inputStreamSerializer1));
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      inputStreamSerializer0.processElement(outputStream0, inputStreamSerializer1);
      assertNotSame(inputStreamSerializer0, inputStreamSerializer1);
      assertNotSame(inputStreamSerializer1, inputStreamSerializer0);
      assertFalse(inputStreamSerializer0.equals((Object)inputStreamSerializer1));
      assertFalse(inputStreamSerializer1.equals((Object)inputStreamSerializer0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      assertNotNull(defaultSerializer0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.processElement(outputStream0, outputStream0);
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      assertNotNull(bytesSerializer0);
      
      DefaultSerializer defaultSerializer1 = new DefaultSerializer();
      assertFalse(defaultSerializer1.equals((Object)defaultSerializer0));
      assertNotNull(defaultSerializer1);
      
      defaultSerializer0.setNext(defaultSerializer1);
      assertNotSame(defaultSerializer0, defaultSerializer1);
      assertNotSame(defaultSerializer1, defaultSerializer0);
      assertFalse(defaultSerializer0.equals((Object)defaultSerializer1));
      assertFalse(defaultSerializer1.equals((Object)defaultSerializer0));
      
      defaultSerializer0.setNext(bytesSerializer0);
      assertNotSame(defaultSerializer0, defaultSerializer1);
      assertFalse(defaultSerializer0.equals((Object)defaultSerializer1));
      
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.setNext(bytesSerializer0);
      assertNotSame(defaultSerializer0, defaultSerializer1);
      assertFalse(defaultSerializer0.equals((Object)defaultSerializer1));
      
      bytesSerializer0.setNext(defaultSerializer0);
      assertNotSame(defaultSerializer0, defaultSerializer1);
      assertFalse(defaultSerializer0.equals((Object)defaultSerializer1));
      
      OutputStream outputStream2 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream3 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.processElement(outputStream3, outputStream3);
      assertNotSame(defaultSerializer0, defaultSerializer1);
      assertFalse(defaultSerializer0.equals((Object)defaultSerializer1));
      
      // Undeclared exception!
      try { 
        defaultSerializer0.processElement(outputStream2, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      assertNotNull(defaultSerializer0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.processElement(outputStream0, outputStream0);
      boolean boolean0 = defaultSerializer0.canProcess("Yn\"WrH1D[w?@[{");
      assertTrue(boolean0);
      
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.process(outputStream1, "Yn\"WrH1D[w?@[{");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      assertNotNull(bytesSerializer0);
      
      OutputStream outputStream0 = null;
      bytesSerializer0.processElement((OutputStream) null, (Object) null);
      // Undeclared exception!
      try { 
        bytesSerializer0.process((OutputStream) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("spark.serialization.BytesSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      assertNotNull(defaultSerializer0);
      
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      assertNotNull(bytesSerializer0);
      
      defaultSerializer0.setNext(bytesSerializer0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.processElement(outputStream0, outputStream0);
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      defaultSerializer0.process(outputStream1, outputStream1);
      InputStreamSerializer inputStreamSerializer0 = new InputStreamSerializer();
      defaultSerializer0.setNext(inputStreamSerializer0);
      BytesSerializer bytesSerializer0 = new BytesSerializer();
      OutputStream outputStream2 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      inputStreamSerializer0.processElement(outputStream2, defaultSerializer0);
      OutputStream outputStream3 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      inputStreamSerializer0.processElement(outputStream3, bytesSerializer0);
      OutputStream outputStream4 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.setNext(defaultSerializer0);
      bytesSerializer0.setNext(inputStreamSerializer0);
      bytesSerializer0.processElement(outputStream4, inputStreamSerializer0);
      bytesSerializer0.canProcess(defaultSerializer0);
      OutputStream outputStream5 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      bytesSerializer0.processElement(outputStream5, "<");
      defaultSerializer0.setNext(bytesSerializer0);
  }
}
