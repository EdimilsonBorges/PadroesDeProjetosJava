import java.util.ArrayList;
import java.util.List;

import AbstractFactory.IDE;
import AbstractFactory.MotifWidgetFactory;
import AbstractFactory.PMWidgetFactory;
import Adapter.Adapter;
import Bridge.IconWindow;
import Bridge.PMWindowImp;
import Bridge.TransienWindow;
import Bridge.XWindowImp;
import Builder.ASCIIConverter;
import Builder.RTFReader;
import Builder.TeXConverter;
import ChainOfResponsability.Button;
import ChainOfResponsability.Dialog;
import ChainOfResponsability.Widget;
import Command.Invoker;
import Composite.Graphic;
import Composite.Line;
import Composite.Picture;
import Composite.Rectangle;
import Composite.Text;
import Decorator.BorderDecorator;
import Decorator.ScrollDecorator;
import Decorator.TextView;
import FactoryMethod.Application;
import FactoryMethod.ExcelApplication;
import FactoryMethod.WordApplication;
import Flyweight.CharFactory;
import Flyweight.CharacterFlyweight;
import Interpreter.AbstractExpression;
import Interpreter.Const;
import Interpreter.Expression;
import Interpreter.Term;
import Iterator.AbstractList;
import Iterator.ListaReversa;
import Mediator.FontDialogDirector;
import Memento.CareTacker;
import Memento.Originator;
import Observer.ConcreteObserver;
import Observer.ConcreteSubject;
import Observer.Observer;
import Proxy.Image;
import Proxy.ImageProxy;
import Singleton.Singleton;
import State.TCPClosed;
import State.TCPConnect;
import State.TCPStablished;
import Strategy.DificilStrategy;
import Strategy.Jogo;
import Strategy.MedioStrategy;
import TemplateMethod.AbstractClass;
import TemplateMethod.ConcreteClass;
import TemplateMethod.ConcreteClass2;
import Visitor.AssignmentNode;
import Visitor.CodeGeneratingVisitor;
import Visitor.NodeVisitor;
import Visitor.TypeCheckingVisitor;
import Visitor.VariableRefNode;

public class Teste {

    public static void main(String[] args) {

        //Command
        Invoker.invoke("A"); // Designer Patterns Command
        Invoker.invoke("B"); // Designer Patterns Command
        Invoker.invoke("C"); // Designer Patterns Command

        
        // //Singleton
        // Singleton.getInstance().metodoExemplo(); // Designer Patterns Singleton
         

        
        // //Factory Method
        // Application app = new WordApplication();
        // app.newDocument();

        // Application apps = new ExcelApplication();
        // apps.newDocument();
         
        
        // //Abstract Factory
        // IDE ide = new IDE(new MotifWidgetFactory()); //Desenha um layout padrão
        // ide.setLayout(new PMWidgetFactory());  //Muda de layout
        

        
        //  // Designer Patterns Strategy
        // Jogo jogo = new Jogo();
        // jogo.jogar();
        // jogo.setStrategy(new MedioStrategy());
        // jogo.jogar();
        // jogo.setStrategy(new DificilStrategy());
        // jogo.jogar();
         
        
        // // Designer Patterns Decorator
        // TextView textView = new TextView();
        // ScrollDecorator scrollDecorator = new ScrollDecorator(textView);
        // BorderDecorator borderDecorator = new BorderDecorator(scrollDecorator);
        // borderDecorator.draw();
        
        
        // // Designer Patterns Observer
        // ConcreteSubject concreteSubject = new ConcreteSubject();

        // Observer observer1 =  new ConcreteObserver();
        // Observer observer2 =  new ConcreteObserver();

        // concreteSubject.attatch(observer1);
        // concreteSubject.attatch(observer2);

        // concreteSubject.detach(observer1);

        // concreteSubject.setState("Outro estado - Obsever", concreteSubject);
         
        
        // // Designer Patterns Observer2
        // ConcreteSubject concreteSubject = new ConcreteSubject();
        // ConcreteObserver concreteObserver = new ConcreteObserver();
        // ConcreteObserver concreteObserver2 = new ConcreteObserver();

        // concreteSubject.addObserver(concreteObserver);
        // concreteSubject.addObserver(concreteObserver2);

        // concreteSubject.setState("Outro estado - Obsever");
         
        
        // // Designer Patterns TemplateMethod
        // AbstractClass abstractClass = new ConcreteClass();
        // abstractClass.templateMethod();

        // abstractClass = new ConcreteClass2();
        // abstractClass.templateMethod();
        
        // // Designer Patterns State
        // TCPConnect tcpConnect = new TCPConnect();
        // tcpConnect.open();
        // tcpConnect.close();
        // tcpConnect.acknowledge();
        // tcpConnect.setTcpState(new TCPStablished());
        // tcpConnect.open();
        // tcpConnect.close();
        // tcpConnect.acknowledge();
        // tcpConnect.setTcpState(new TCPClosed());
        // tcpConnect.open();
        // tcpConnect.close();
        // tcpConnect.acknowledge();
         
        
        // // Designer Patterns Composite
        // Graphic graphic = new Picture();

        // Picture picture = new Picture();
        // Line line = new Line();
        // Rectangle rectangle = new Rectangle();
        // Text text = new Text();

        // picture.add(line);
        // picture.add(rectangle);
        // picture.add(text);

        // Line line1 = new Line();
        // Rectangle rectangle1 = new Rectangle();

        // graphic.add(picture);
        // graphic.add(line1);
        // graphic.add(rectangle1);

        // graphic.draw();
         
        
        // // Designer Patterns Adapter
        // Adapter adapter = new Adapter();
        // System.out.println(adapter.specificRequest());
        // // Designer Patterns Adapter2
        // Adapter2.Adapter adapter2 = new Adapter2.Adapter(new Adapter2.Adaptee());
        // System.out.println(adapter2.request());
         
        
        // // Designer Patterns Bridge
        //  IconWindow iconWindow = new IconWindow();
        //  iconWindow.setWindowImp(new XWindowImp()); //PRIMEIRA FORMA
        //  iconWindow.setWindowImp(new PMWindowImp());  //SEGUNDA FORMA
        //  iconWindow.drawBorder();

        // TransienWindow transienWindow = new TransienWindow();
        // transienWindow.setWindowImp(new XWindowImp()); //TERCEIRA FORMA
        // transienWindow.setWindowImp(new PMWindowImp());  //QUARTA FORMA
        // transienWindow.drawRect();
         

        
        // // Designer Patterns Builder
        // RTFReader rtfReader = new RTFReader(new ASCIIConverter());
        // String string = rtfReader.parseRTF("char font para");
        // System.out.println(string);

        // rtfReader.setBuilder(new TeXConverter());
        // string = rtfReader.parseRTF("char font para");
        // System.out.println(string);
         
         
        // //Proxy
        // Image image = new Image();

        // Graphic graphic =  (Graphic) new ImageProxy(image); // com proxy
        // graphic.draw();
        // graphic.getExtent();

        // graphic = (Graphic) image; // sem proxy
        // graphic.draw();
        // graphic.getExtent();
         

        
        // //Chain Of Responsability
        // Widget widget = new Widget(null);
        // Dialog dialog = new Dialog(widget);
        // Button button = new Button(dialog,true);
        // Button button2 = new Button(dialog,false);

        // button.handlerHelp();
        // button2.handlerHelp();
         
        
        // //Itarator
        // AbstractList lista = new ListaReversa();
        // lista.appent(10);
        // lista.appent(40);
        // lista.appent(90);
        // lista.appent(60);

        // for(Object object: lista){
        //     System.out.println( object.toString());
        // }
         
        
        // //Flyweight
        // List<CharacterFlyweight> textoEmMemoria = new ArrayList<>();

        // String texto = "Este é um texto onde as palavras se repetem";
        // System.out.println("Tamanho do texto = "+texto.length()+ " - Flyweight");
        // for (char c : texto.toCharArray()) {
        //  textoEmMemoria.add(CharFactory.getFlyweight(c));
        // }

        // for (CharacterFlyweight characterFlyweigth: textoEmMemoria) {
        //     characterFlyweigth.print("-");
        // }

        // CharacterFlyweight.getInstancias();
         
        
        // // Interpreter
        // Const c10 = new Const(10);
        // Const c20 = new Const(20);
        // Const c30 = new Const(30);

        // Term t10 = new Term(c10);
        // Term t20 = new Term(c20);

        // Term tt20c30 = new Term(t20,c30);
        // Expression e10 = new Expression(t10);

        // AbstractExpression e = new Expression(e10,tt20c30);

        // System.out.println(""+ e.interpret());
         
        // // Mediator
        // FontDialogDirector fontDialogDirector = new FontDialogDirector();
        // fontDialogDirector.createWidget();
        // fontDialogDirector.getEntryField().setText();
         
        
        // // Memento
        // Originator originator = new Originator();
        // CareTacker careTacker = new CareTacker(originator);
        // originator.moveLeft();
        // originator.moveRigth();
        // originator.moveLeft();
        // careTacker.saveStates();
        // originator.moveLeft();
        // originator.moveRigth();
        // careTacker.saveStates();
        // careTacker.undo();
        // careTacker.undo();
         
        // //Visitor
        // AssignmentNode assignmentNode = new AssignmentNode();
        // assignmentNode.setTypeLeftHandeVar("String");
        // assignmentNode.setTypeHigthHandeExp("String");

        // VariableRefNode variableRefNode = new VariableRefNode();
        // variableRefNode.setNomeVar("MinhaVariavel");

        // NodeVisitor nodeVisitor1 = new TypeCheckingVisitor();
        // NodeVisitor nodeVisitor2 = new CodeGeneratingVisitor();

        // assignmentNode.accept(nodeVisitor1);
        // variableRefNode.accept(nodeVisitor1);

        // assignmentNode.accept(nodeVisitor2);
        // variableRefNode.accept(nodeVisitor2);


    }
}