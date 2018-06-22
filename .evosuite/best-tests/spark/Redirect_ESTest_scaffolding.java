/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jun 22 02:07:09 GMT 2018
 */

package spark;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Redirect_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "spark.Redirect"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/_x/tfjywptd7r50k3bqzfvdz4pc0000gn/T/"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/jobs/spark-jul-4-2016/workspace"); 
    java.lang.System.setProperty("user.home", "/Users/jhveras"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "jhveras"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib/resources.jar:/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib/rt.jar:/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib/sunrsasign.jar:/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib/jsse.jar:/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib/jce.jar:/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib/charsets.jar:/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib/jfr.jar:/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "5"); 
    java.lang.System.setProperty("process_communication_port", "18559"); 
    java.lang.System.setProperty("initialization_timeout", "5"); 
    java.lang.System.setProperty("assertion_timeout", "5"); 
    java.lang.System.setProperty("junit_tests", "true"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("analysis_criteria", ""); 
    java.lang.System.setProperty("sun.boot.library.path", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/tools/hudson.model.JDK/jdk-8/jre/lib"); 
    java.lang.System.setProperty("enable_asserts_for_evosuite", "false"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("http.nonProxyHosts", "local|*.local|169.254/16|*.169.254/16"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("configuration_id", "default"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("ctg_time_per_class", "2"); 
    java.lang.System.setProperty("write_pool", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/jobs/spark-jul-4-2016/workspace/.evosuite/tmp_2018_06_21_22_57_01/pools/spark.Redirect.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "5"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeBig"); 
    java.lang.System.setProperty("socksNonProxyHosts", "local|*.local|169.254/16|*.169.254/16"); 
    java.lang.System.setProperty("ftp.nonProxyHosts", "local|*.local|169.254/16|*.169.254/16"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/jobs/spark-jul-4-2016/workspace/.evosuite/evosuite-seeds/spark.Redirect.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "30"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("gopherProxySet", "false"); 
    java.lang.System.setProperty("master_log_port", "52337"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/jobs/spark-jul-4-2016/workspace/.evosuite/tmp_2018_06_21_22_57_01/logs/spark.Redirect"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/jobs/spark-jul-4-2016/workspace/.evosuite/tmp_2018_06_21_22_57_01/reports/spark.Redirect"); 
    java.lang.System.setProperty("minimization_timeout", "5"); 
    java.lang.System.setProperty("CP_file_path", "/var/folders/_x/tfjywptd7r50k3bqzfvdz4pc0000gn/T/EvoSuite_classpathFile3424833969620504122.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/jobs/spark-jul-4-2016/workspace/.evosuite/tmp_2018_06_21_22_57_01/seeds/spark.Redirect.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "spark.Redirect"); 
    java.lang.System.setProperty("spawn_process_manager_port", "51567"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "5"); 
    java.lang.System.setProperty("test_dir", "/Users/jhveras/evosuite/evosuite/plugins/jenkins/work/jobs/spark-jul-4-2016/workspace/.evosuite/tmp_2018_06_21_22_57_01/tests"); 
    java.lang.System.setProperty("search_budget", "30"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Redirect_ESTest_scaffolding.class.getClassLoader() ,
      "spark.route.Routes",
      "spark.Routable",
      "spark.route.RouteEntry",
      "spark.ResponseTransformerRouteImpl",
      "spark.utils.Wrapper",
      "spark.ssl.SslStores",
      "spark.route.RouteOverview",
      "spark.Service$StaticFiles",
      "spark.TemplateEngine",
      "spark.Service$1",
      "spark.Request",
      "spark.RouteImpl",
      "spark.globalstate.ServletFlag",
      "spark.route.HttpMethod",
      "spark.Route",
      "spark.Filter",
      "spark.Redirect",
      "spark.Redirect$Status",
      "spark.RouteImpl$1",
      "spark.embeddedserver.EmbeddedServer",
      "spark.HaltException",
      "spark.ExceptionHandlerImpl",
      "spark.FilterImpl",
      "spark.ExceptionHandler",
      "spark.TemplateViewRouteImpl",
      "spark.Response",
      "spark.Service",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.TemplateViewRoute",
      "spark.ResponseTransformer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Redirect_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "spark.Redirect",
      "spark.Redirect$Status",
      "spark.Routable",
      "spark.Service",
      "spark.Service$StaticFiles",
      "spark.globalstate.ServletFlag",
      "spark.staticfiles.StaticFilesConfiguration",
      "spark.route.HttpMethod",
      "spark.RouteImpl",
      "spark.RouteImpl$1",
      "spark.route.Routes",
      "spark.route.RouteEntry",
      "spark.route.RouteOverview",
      "spark.utils.Assert",
      "spark.resource.AbstractResource",
      "spark.resource.AbstractFileResolvingResource",
      "spark.resource.ClassPathResource",
      "spark.utils.StringUtils",
      "spark.utils.CollectionUtils",
      "spark.utils.ClassUtils",
      "spark.resource.ExternalResource",
      "spark.utils.ResourceUtils",
      "spark.ssl.SslStores",
      "spark.HaltException",
      "spark.ExceptionHandlerImpl",
      "spark.Service$1",
      "spark.ExceptionMapper",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.security.SecurityHandler$1",
      "org.eclipse.jetty.security.SecurityHandler$2",
      "org.eclipse.jetty.security.SecurityHandler",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.Jetty",
      "org.eclipse.jetty.server.handler.ContextHandler",
      "spark.embeddedserver.jetty.EmbeddedJettyServer",
      "spark.resource.AbstractResourceHandler",
      "spark.resource.ExternalResourceHandler",
      "spark.TemplateEngine",
      "spark.TemplateViewRouteImpl",
      "spark.TemplateViewRouteImpl$1",
      "org.eclipse.jetty.server.handler.gzip.GzipHandler",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.http.PathMap$PathSet",
      "org.eclipse.jetty.http.PathMap",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.ArrayTernaryTrie",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.http.HttpMethod",
      "org.eclipse.jetty.util.BufferUtil",
      "org.eclipse.jetty.http.HttpField",
      "org.eclipse.jetty.http.Http1FieldPreEncoder",
      "org.eclipse.jetty.http.PreEncodedHttpField",
      "org.eclipse.jetty.http.HttpHeader",
      "org.eclipse.jetty.http.HttpVersion",
      "org.eclipse.jetty.http.MimeTypes$Type",
      "org.eclipse.jetty.http.MimeTypes",
      "org.eclipse.jetty.http.PathMap$MappedEntry"
    );
  }
}
