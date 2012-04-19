
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq(/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq(format.raw/*5.21*/("""
    
    <h1>"""),_display_(Seq(/*7.10*/tasks/*7.15*/.size())),format.raw/*7.22*/(""" task(s)</h1>
    
    <ul>
        """),_display_(Seq(/*10.10*/for(task <- tasks) yield /*10.28*/ {_display_(Seq(format.raw/*10.30*/("""
            <li>
                """),_display_(Seq(/*12.18*/task/*12.22*/.label)),format.raw/*12.28*/("""
                
                """),_display_(Seq(/*14.18*/form(routes.Application.deleteTask(task.id))/*14.62*/ {_display_(Seq(format.raw/*14.64*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*16.18*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
    </ul>
    
    <h2>Add a new task</h2>
    
    """),_display_(Seq(/*23.6*/form(routes.Application.newTask())/*23.40*/ {_display_(Seq(format.raw/*23.42*/("""
        
        """),_display_(Seq(/*25.10*/inputText(taskForm("label")))),format.raw/*25.38*/(""" 
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*29.6*/("""
    
""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]) = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 19 21:25:33 CEST 2012
                    SOURCE: /home/alvaro/Descargas/play-2.0/Play2.0/app/views/index.scala.html
                    HASH: bfd7f71df978298f1b5c11c03fbf1cff6946689e
                    MATRIX: 770->1|899->42|927->61|958->63|983->80|1017->82|1062->97|1075->102|1103->109|1171->146|1205->164|1240->166|1306->201|1319->205|1347->211|1413->246|1466->290|1501->292|1608->367|1668->395|1752->449|1795->483|1830->485|1880->504|1930->532|2031->602|2069->609
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|47->18|52->23|52->23|52->23|54->25|54->25|58->29|60->31
                    -- GENERATED --
                */
            