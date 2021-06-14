package math;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.input.MouseEvent;
/**
 *
 * @author Grant Burke
 * @author Vincent Verdugo
 */
public class Math extends Application 
{
    public static BorderPane siteLayout;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException 
    {
        
        // create Text for subjects
        Text subjectsText = new Text("Subjects");
        subjectsText.setFont(Font.font("Serif",40));
        subjectsText.setStroke(Color.BLUE);
        subjectsText.setFill(Color.LIGHTBLUE);
        
        // create file input streams for all the images
        
        FileInputStream algebraStream = new FileInputStream("");
        FileInputStream basicStream = new FileInputStream("");
        FileInputStream calculusStream = new FileInputStream("");
        FileInputStream geometryStream = new FileInputStream("");
        FileInputStream moreStream = new FileInputStream("");
        FileInputStream preAlgebraStream = new FileInputStream("");
        FileInputStream statisticsStream = new FileInputStream("");
        FileInputStream trigonometryStream = new FileInputStream("");
        
        FileInputStream einsteinStream = new FileInputStream("");
        FileInputStream diracStream = new FileInputStream("");
        FileInputStream newtonStream = new FileInputStream("");
        FileInputStream gaussStream = new FileInputStream("");
        FileInputStream gameStream = new FileInputStream("");
        FileInputStream guideStream = new FileInputStream("");
        FileInputStream practiceStream = new FileInputStream("");
        FileInputStream storeStream = new FileInputStream("");
        FileInputStream toolsStream = new FileInputStream("");
        FileInputStream tutorStream = new FileInputStream("");
        FileInputStream bannerStream = new FileInputStream("");
        
        // create the images
        Image algebraImage = new Image(algebraStream);
        Image preAlgebraImage = new Image(preAlgebraStream);
        Image geometryImage = new Image(geometryStream);
        Image trigonometryImage = new Image(trigonometryStream);
        Image statisticsImage = new Image(statisticsStream);
        Image calculusImage = new Image(calculusStream);
        Image moreImage = new Image(moreStream);
        Image basicImage = new Image(basicStream);
        Image einsteinImage = new Image(einsteinStream);
        Image diracImage = new Image(diracStream);
        Image newtonImage = new Image(newtonStream);
        Image gaussImage = new Image(gaussStream);
        Image gameImage = new Image(gameStream);
        Image guideImage = new Image(guideStream);
        Image practiceImage = new Image(practiceStream);
        Image storeImage = new Image(storeStream);
        Image toolsImage = new Image(toolsStream);
        Image tutorImage = new Image(tutorStream);
        Image bannerImage = new Image(bannerStream);
        
        //Image appleImage = new Image(appleStream);
        //Image parentsImage = new Image(parentsStream);
        
        // create the image views for the subjects left border pane
        ImageView basicImageView = getIconImageView(basicImage);
        ImageView preAlgebraImageView = getIconImageView(preAlgebraImage);
        ImageView algebraImageView = getIconImageView(algebraImage);
        ImageView geometryImageView = getIconImageView(geometryImage);
        ImageView trigonometryImageView = getIconImageView(trigonometryImage);
        ImageView statisticsImageView = getIconImageView(statisticsImage);
        ImageView calculusImageView = getIconImageView(calculusImage);
        ImageView moreImageView = getIconImageView(moreImage);
        
        // creae the image views for the student assistance right border pane
        ImageView gameImageView = getIconImageView(gameImage);
        ImageView guideImageView = getIconImageView(guideImage);
        ImageView practiceImageView = getIconImageView(practiceImage);
        ImageView storeImageView = getIconImageView(storeImage);
        ImageView toolsImageView = getIconImageView(toolsImage);
        ImageView tutorImageView = getIconImageView(tutorImage);
        
        // create the image views for the portraits of mathematicians center border pane
        ImageView einsteinImageView = getMathematicianImageView(einsteinImage);
        ImageView diracImageView = getMathematicianImageView(diracImage);
        ImageView newtonImageView = getMathematicianImageView(newtonImage);
        ImageView gaussImageView = getMathematicianImageView(gaussImage);
        
        // create the image view for the banner top border pane
        ImageView bannerImageView = new ImageView(bannerImage);
        bannerImageView.setFitHeight(250);
        bannerImageView.setFitWidth(1915);
        bannerImageView.setSmooth(true);
        bannerImageView.setCache(true);
        
        // create the image views for the teacher and parents sections top border pane buttons
        /*ImageView appleImageView = new ImageView(appleImage);
        appleImageView.setFitHeight(125);
        appleImageView.setFitWidth(125);
        appleImageView.setSmooth(true);
        appleImageView.setCache(true);
        
        //ImageView parentsImageView = new ImageView(parentsImage);
        parentsImageView.setFitHeight(125);
        parentsImageView.setFitWidth(125);
        parentsImageView.setSmooth(true);
        parentsImageView.setCache(true); */
        
        // create the buttons for top menu border pane
        Button homeButton = getTopButton("Home");
        Button teacherButton = getTopButton("Teacher");
        Button parentsButton = getTopButton("Parents");
        Button glossaryButton = getTopButton("Glossary");
        Button aboutUsButton = getTopButton("About Us");
        
        // create the text for assistance menu (right)
        Text assistanceText = new Text("Student Assistance");
        assistanceText.setFont(Font.font("Serif",40));
        assistanceText.setStroke(Color.GREEN);
        assistanceText.setFill(Color.LIGHTGREEN);
        
        // create all the buttons for the subjects
        Button basicButton = getLeftButton("Basic Math", basicImageView);
        Button preAlgebraButton = getLeftButton("Pre-Algebra", preAlgebraImageView);
        Button algebraButton = getLeftButton("Algebra", algebraImageView);
        Button geometryButton = getLeftButton("Geometry", geometryImageView);
        Button trigonometryButton = getLeftButton("Trigonometry", trigonometryImageView);
        Button statisticsButton = getLeftButton("Statistics", statisticsImageView);
        Button calculusButton = getLeftButton("Calculus", calculusImageView);
        Button moreButton = getLeftButton("More", moreImageView);
        
        // create the buttons for the right border pane menu
        Button mathGuidesButton = getRightButton("Math Guides", guideImageView);
        Button practiceButton = getRightButton("Practice Problems", practiceImageView);
        Button tutoringButton = getRightButton("Tutoring", tutorImageView);
        Button mathToolsButton = getRightButton("Math Tools", toolsImageView);
        Button mathGamesButton = getRightButton("Math Games", gameImageView);
        Button storeButton = getRightButton("Store", storeImageView);
        
        // create HBoxes for assistance which each include a picture and a button
        HBox guideHBox = getIconHBox(guideImageView, mathGuidesButton);
        HBox practiceHBox = getIconHBox(practiceImageView, practiceButton);
        HBox tutoringHBox = getIconHBox(tutorImageView, tutoringButton);
        HBox toolsHBox = getIconHBox(toolsImageView, mathToolsButton);
        HBox gamesHBox = getIconHBox(gameImageView, mathGamesButton);
        HBox storeHBox = getIconHBox(storeImageView, storeButton);
        
        // create HBoxes for subjects which each include a picture and button
        HBox basicHBox = getIconHBox(basicImageView, basicButton);
        HBox preAlgebraHBox = getIconHBox(preAlgebraImageView, preAlgebraButton);
        HBox algebraHBox = getIconHBox(algebraImageView, algebraButton);
        HBox geometryHBox = getIconHBox(geometryImageView, geometryButton);
        HBox trigonometryHBox = getIconHBox(trigonometryImageView, trigonometryButton);
        HBox statisticsHBox = getIconHBox(statisticsImageView, statisticsButton);
        HBox calculusHBox = getIconHBox(calculusImageView, calculusButton);
        HBox moreHBox = getIconHBox(moreImageView, moreButton);
        
        // create VBox for all the HBoxes for subjects
        VBox subjectsVBox = new VBox();
        subjectsVBox.getChildren().addAll(subjectsText, basicHBox, preAlgebraHBox,
        algebraHBox, geometryHBox, trigonometryHBox, statisticsHBox, calculusHBox, moreHBox);
        subjectsVBox.setAlignment(Pos.CENTER);
        subjectsVBox.setPadding(new Insets(10));
        subjectsVBox.setSpacing(20);
        subjectsVBox.setStyle("-fx-border-color: black");
        subjectsVBox.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        // create VBox for all the HBoxes for assistance
        VBox assistanceVBox = new VBox(assistanceText, guideHBox, practiceHBox, 
        tutoringHBox, toolsHBox, gamesHBox, storeHBox);
        assistanceVBox.setSpacing(20);
        assistanceVBox.setAlignment(Pos.CENTER);
        assistanceVBox.setPadding(new Insets(10));
        assistanceVBox.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        // create the labels for the quotes section
        Label introLabel = new Label("We hope your visit to Math.com brings you a greater "
                + "love of mathematics, both for its beauty and its power to help solve "
                + "everyday problems");
        introLabel.setFont(Font.font("Courier", FontPosture.ITALIC,35));
        introLabel.setWrapText(true);
        
        Label einsteinQuoteLabel = getQuoteLabel("Do not worry about your difficulties in mathematics, "
                + "I assure you that mine are greater.");
        
        Label diracQuoteLabel = getQuoteLabel("Mathematics is the tool specially suited for dealing "
                + "with abstract concepts of any kind and there is no limit to its power in this field.");
        
        Label newtonQuoteLabel = getQuoteLabel("If I have been able to see further, it was only because I stood "
                + "on the shoulders of giants.");
        
        Label gaussQuoteLabel = getQuoteLabel("Mathematics is the queen of science, and arithmetic the queen "
                + "of mathematics.");
        
        Label einsteinNameLabel = getNameLabel("Albert Einstein (1879-1955)");
        Label diracNameLabel = getNameLabel("Paul Dirac (1902-1984)");
        Label newtonNameLabel = getNameLabel("Isaac Newton (1643-1727)");
        Label gaussNameLabel = getNameLabel("Carl Friedrich Gauss (1777-1855)");
        
        // create the HBoxes for mathematician quotes and pictures to add to a VBox. 
        // The VBox will be added to a scroll pane
        HBox einsteinHBox = getMathematicianHBox(einsteinNameLabel, einsteinImageView);
        HBox diracHBox = getMathematicianHBox(diracNameLabel, diracImageView);
        HBox newtonHBox = getMathematicianHBox(newtonNameLabel, newtonImageView);
        HBox gaussHBox = getMathematicianHBox(gaussNameLabel, gaussImageView);
        
        // create the teacher section hyperlinks
        Hyperlink teacherLink1 = getTeacherHyperlink("Careers");
        Hyperlink teacherLink2 = getTeacherHyperlink("Lesson Plans");
        Hyperlink teacherLink3 = getTeacherHyperlink("Classroom Resources");
        Hyperlink teacherLink4 = getTeacherHyperlink("Teacher Centers");
        
        // create the parents section content
        Hyperlink parentLink1 = getParentHyperlink("Homeschooling");
        Hyperlink parentLink2 = getParentHyperlink("Lessons");
        Hyperlink parentLink3 = getParentHyperlink("Advice");  
        Hyperlink parentLink4 = getParentHyperlink("Special Needs");
        
        // create the glossary section content, this section will be the most
        // different, we will be implementing a small glossary into this section
        
        // the label that will hold the current definition being displayed
        Label glossaryDefinition = new Label();
        glossaryDefinition.setWrapText(true);
        glossaryDefinition.setStyle("-fx-background-color: red;");
        
        
        // the labels for each letter of the alphabet
        Label aLabel = new Label("A\n"); aLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label bLabel = new Label("B\n"); bLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label cLabel = new Label("C\n"); cLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label dLabel = new Label("D\n"); dLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label eLabel = new Label("E\n"); eLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label fLabel = new Label("F\n"); fLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label gLabel = new Label("G\n"); gLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label hLabel = new Label("H\n"); hLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label iLabel = new Label("I\n"); iLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label jLabel = new Label("J\n"); jLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label kLabel = new Label("K\n"); kLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label lLabel = new Label("L\n"); lLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label mLabel = new Label("M\n"); mLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label nLabel = new Label("N\n"); nLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label oLabel = new Label("O\n"); oLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label pLabel = new Label("P\n"); pLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label qLabel = new Label("Q\n"); qLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label rLabel = new Label("R\n"); rLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label sLabel = new Label("S\n"); sLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label tLabel = new Label("T\n"); tLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label uLabel = new Label("U\n"); uLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label vLabel = new Label("V\n"); vLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label wLabel = new Label("W\n"); wLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label xLabel = new Label("X\n"); xLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label yLabel = new Label("Y\n"); yLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        Label zLabel = new Label("Z\n"); zLabel.setFont(Font.font("Blackboard", FontWeight.BOLD, 25));
        
        // A definitions
        Label absoluteValueDefinition = new Label("Absolute Value\n\nThe distance of a number from zero; the positive value of a number.");
        Label additiveIdentityDefinition = new Label("Additive Identity\n\nThe number zero is called the additive identity because the sum "
                + "of zero and any number is that number.");
        Label additiveInverseDefinition = new Label("Additive Inverse\n\nThe additive inverse of any number x is the number that gives zero "
                + "when added to x. The additive inverse of 5 is -5.");
        Label angleDefinition = new Label("Angle\n\nThe union of two rays with a common endpoint, called the vertex.");
        Label axisOfSymmetryDefinition = new Label("Axis of Symmetry\n\nA line that passes through a figure in such a way that the part of "
                + "the figure on one side of the line is a mirror reflection of the part on the other side of the line.");
        
        // B definitions
        Label baseDefinition = new Label("Base\n\nThe bottom of a plane figure or three-dimensional figure.");
        Label bisectDefinition = new Label("Bisect\n\nTo divide into two congruent parts.");
        
        // C definitions
        Label cartesianCoordinatesDefinition = new Label("Cartesian coordinates\n\nA system in which points on a plane are identified by an "
                + "ordered pair of numbers, representing the distances to two or three perpendicular axes.");
        Label circumferenceDefinition = new Label("Circumference\n\nThe distance around a circle.");
        Label coefficientDefinition = new Label("Coefficient\n\nA constant that multiplies a variable.");
        
        // D definitions
        Label degreeDefinition = new Label("Degree\n\nA unit of measure of an angle");
        Label diameterDefinition = new Label("Diameter\n\nThe line segment joining two points on a circle and passing through the center of the circle.");
        Label distributivePropertyDefinition = new Label("Distributive Property\n\na(b + c) = ab + ac");
        
        // E definitions
        Label ellipseDefinition = new Label("Ellipse\n\nThe set of all points in a plane such that the sum of the distances to two fixed points is a constant.");
        Label equationDefinition = new Label("Equation\n\nA mathematical statement that says that two expressions have the same value; any number sentence with an =.");
        Label evenNumberDefinition = new Label("Even Number\n\nA natural number that is divisible by 2."); 
        
        // F definitions
        Label factorDefinition = new Label("Factor\n\nOne of two or more expressions that are multiplied together to get a product.");
        Label fractionDefinition = new Label("Fraction\n\nA number used to name a part of a group or a whole. The number below the bar is the denominator, and the number above the bar is the numerator.");
        Label frequencyDefinition = new Label("Frequency\n\nThe number of times a particular item appears in a data set."); 
        
        // Hyperlinks for all the definitions, whenever a hyperlink is pressed, an action will
        // be triggered that will change the glossaryDefinition label to the text of that definition
        
        // A hyperlinks
        Hyperlink absoluteValue = getGlossaryHyperlink("absolute value",absoluteValueDefinition,glossaryDefinition);
        Hyperlink additiveIdentity = getGlossaryHyperlink("additive identity",additiveIdentityDefinition,glossaryDefinition);
        Hyperlink additiveInverse = getGlossaryHyperlink("additive inverse",additiveInverseDefinition,glossaryDefinition);
        Hyperlink angle = getGlossaryHyperlink("angle",angleDefinition,glossaryDefinition);
        Hyperlink axisOfSymmetry = getGlossaryHyperlink("axis of symmetry",axisOfSymmetryDefinition,glossaryDefinition);
        
        // B hyperlinks
        Hyperlink base = getGlossaryHyperlink("base",baseDefinition,glossaryDefinition);
        Hyperlink bisect = getGlossaryHyperlink("bisect",bisectDefinition,glossaryDefinition);
        
        // C hyperlinks
        Hyperlink cartesianCoordinates = getGlossaryHyperlink("cartesian coordinates",cartesianCoordinatesDefinition,glossaryDefinition);
        Hyperlink circumference = getGlossaryHyperlink("circumference",circumferenceDefinition,glossaryDefinition);
        Hyperlink coefficient = getGlossaryHyperlink("coefficient",coefficientDefinition,glossaryDefinition);
        
        // D hyperlinks
        Hyperlink degree = getGlossaryHyperlink("degree",degreeDefinition,glossaryDefinition);
        Hyperlink diameter = getGlossaryHyperlink("diameter",diameterDefinition,glossaryDefinition);
        Hyperlink distributiveProperty = getGlossaryHyperlink("distributive property",distributivePropertyDefinition,glossaryDefinition);
        
        // E hyperlinks
        Hyperlink ellipse = getGlossaryHyperlink("ellipse",ellipseDefinition,glossaryDefinition);
        Hyperlink equation = getGlossaryHyperlink("equation",equationDefinition,glossaryDefinition);
        Hyperlink evenNumber = getGlossaryHyperlink("even number",evenNumberDefinition,glossaryDefinition);
        
        // F hyperlinks
        Hyperlink factor = getGlossaryHyperlink("factor",factorDefinition,glossaryDefinition);
        Hyperlink fraction = getGlossaryHyperlink("fraction",fractionDefinition,glossaryDefinition);
        Hyperlink frequency = getGlossaryHyperlink("frequency",frequencyDefinition,glossaryDefinition);
        
        // create the about us section content
        Label aboutMathComLabel = new Label("About Math.com");
        aboutMathComLabel.setTextFill(Color.DARKBLUE);
        aboutMathComLabel.setFont(Font.font("Blackboard",35));
        
        Label aboutUsLabel = new Label("Math.com is dedicated to providing revolutionary ways "
                + "for students, parents, teachers, and everyone to learn math. Combining educationally "
                + "sound principles with proprietary technology, Math.com offers a unique experience that quickly "
                + "guides the user to the solutions they need and the products they want. These solutions include "
                + "assessment, on-demand modular courses that target key math concepts, 24/7 live online tutoring, and "
                + "expert answers to math questions. In addition to solutions, Math.com offers exploratory and recreational "
                + "introductions to the world of math that will lead to deeper understanding and enjoyment. The range of "
                + "services, products and solutions offered makes Math.com the single source for all math needs. Math.com is a "
                + "division of Leap of Faith Financial Services Inc.");
        aboutUsLabel.setWrapText(true);
        aboutUsLabel.setFont(Font.font("Courier", FontPosture.ITALIC, 30));
        
        //create the VBoxes to put in the scroll pane
        VBox homeScrollPaneContents = new VBox(introLabel,einsteinQuoteLabel,einsteinHBox,diracQuoteLabel,diracHBox,
        newtonQuoteLabel,newtonHBox,gaussQuoteLabel,gaussHBox);
        homeScrollPaneContents.setMinSize(1000,100);
        homeScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
       
        VBox teacherScrollPaneContents = new VBox(teacherLink1,teacherLink2,teacherLink3,teacherLink4);
        teacherScrollPaneContents.setAlignment(Pos.CENTER);
        teacherScrollPaneContents.setMinSize(1000,725);
        teacherScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox parentsScrollPaneContents = new VBox(parentLink1,parentLink2,parentLink3,parentLink4);
        parentsScrollPaneContents.setAlignment(Pos.CENTER);
        parentsScrollPaneContents.setMinSize(1000,725);
        parentsScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        // glossary is the most different of all the top menu buttons
        VBox glossaryWords = new VBox(aLabel,absoluteValue,additiveIdentity,additiveInverse,angle,axisOfSymmetry,bLabel,base,bisect,cLabel,
        cartesianCoordinates,circumference,coefficient,dLabel,degree,diameter,distributiveProperty,eLabel,ellipse,equation,evenNumber,fLabel,
        factor,fraction,frequency,gLabel,hLabel,iLabel,jLabel,kLabel,lLabel,mLabel,nLabel,oLabel,pLabel,qLabel,rLabel,sLabel,
        tLabel,uLabel,vLabel,wLabel,xLabel,yLabel,zLabel);
        
        ScrollPane glossaryScrollPane = new ScrollPane(glossaryWords);
        glossaryScrollPane.setMinWidth(250);
        glossaryScrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
        glossaryScrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        glossaryScrollPane.setPadding(new Insets(20));
        
        HBox glossaryContents = new HBox(glossaryScrollPane,glossaryDefinition);
        //glossaryContents.setStyle("-fx-background-color: #E2EFFE;");
        
        VBox aboutUsScrollPaneContents = new VBox(aboutMathComLabel,aboutUsLabel);
        aboutUsScrollPaneContents.setAlignment(Pos.CENTER);
        aboutUsScrollPaneContents.setMinSize(1000,725);
        aboutUsScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        // create a scroll pane and add the VBox to it
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(homeScrollPaneContents);
        scrollPane.setFitToWidth(true);
        scrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setPadding(new Insets(20));
        scrollPane.setMaxWidth(1000);
        
        scrollPane.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        homeScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        
        // set the top border pane buttons' actions
         homeButton.setOnAction(e ->{
            scrollPane.setContent(homeScrollPaneContents);
            siteLayout.setCenter(scrollPane);
        });
        
        teacherButton.setOnAction(e ->{
            scrollPane.setContent(teacherScrollPaneContents);
            siteLayout.setCenter(scrollPane);
        });
        
        parentsButton.setOnAction(e ->{
            scrollPane.setContent(parentsScrollPaneContents);
            siteLayout.setCenter(scrollPane);
        });
        
        glossaryButton.setOnAction(e ->{
            siteLayout.setCenter(glossaryContents);
        });
        
        aboutUsButton.setOnAction(e ->{
            scrollPane.setContent(aboutUsScrollPaneContents);
            siteLayout.setCenter(scrollPane);
        });
        
        // create the text for the site name
        Text siteName = new Text(35,80, "Math.com");
        siteName.setFont(new Font("Impact", 60));
        siteName.setStroke(Color.CRIMSON);
        siteName.setFill(Color.RED);
        
        // create the top layout
        HBox menuInnerHB = new HBox(homeButton, teacherButton, parentsButton, glossaryButton, aboutUsButton);
        menuInnerHB.setPadding(new Insets(100));
        menuInnerHB.setSpacing(30);
        HBox menuOuterHB = new HBox(10, siteName, menuInnerHB);
        menuOuterHB.setStyle("-fx-border-color: black");
        siteLayout = new BorderPane();
        
        StackPane stackPane = new StackPane(bannerImageView,menuOuterHB);
                
        siteLayout.setTop(stackPane);
        siteLayout.setLeft(subjectsVBox);
        siteLayout.setCenter(scrollPane);
        siteLayout.setRight(assistanceVBox);
        
        // this Rectangle2D object will be created to get the size of the current screen of the user
        Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
        
        // create the home page scene
        Scene scene = new Scene(siteLayout,screenSize.getWidth(),screenSize.getHeight());
        
        // create hyperlinks to use for different topics in subjects scene
        Hyperlink additionTable = new Hyperlink("Addition Table");
        additionTable.setFont(Font.font("Serif", 20));
        additionTable.setTextFill(Color.BLUE);
        additionTable.setUnderline(true);
        
        Hyperlink multiplicationTable = new Hyperlink("Multiplication Table");
        multiplicationTable.setFont(Font.font("Serif", 20));
        multiplicationTable.setTextFill(Color.BLUE);
        multiplicationTable.setUnderline(true);
        
        // scroll pane contents for the left border pane subjects buttons
        VBox basicScrollPaneContents = new VBox();
        basicScrollPaneContents.setMinSize(1000,100);
        basicScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox preAlgebraScrollPaneContents = new VBox();
        preAlgebraScrollPaneContents.setMinSize(1000,100);
        preAlgebraScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox algebraScrollPaneContents = new VBox();
        algebraScrollPaneContents.setMinSize(1000,100);
        algebraScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox geometryScrollPaneContents = new VBox();
        geometryScrollPaneContents.setMinSize(1000,100);
        geometryScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox trigonometryScrollPaneContents = new VBox();
        trigonometryScrollPaneContents.setMinSize(1000,100);
        trigonometryScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox statisticsScrollPaneContents = new VBox();
        statisticsScrollPaneContents.setMinSize(1000,100);
        statisticsScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox calculusScrollPaneContents = new VBox();
        calculusScrollPaneContents.setMinSize(1000,100);
        calculusScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        VBox moreScrollPaneContents = new VBox();
        moreScrollPaneContents.setMinSize(1000,100);
        moreScrollPaneContents.setBackground(new Background(new BackgroundFill(Color.rgb(255, 210, 130), CornerRadii.EMPTY, Insets.EMPTY)));
        
        // set the button actions of the left border pane subjects buttons
        /*
        basicButton.setOnAction(e -> {

        });
        
        preAlgebraButton.setOnAction(e -> {
  
        });
        
        algebraButton.setOnAction(e -> {

        });
        
        geometryButton.setOnAction(e -> {
 
        });
        
        trigonometryButton.setOnAction(e -> {

        });
        
        statisticsButton.setOnAction(e -> {

        });
        
        calculusButton.setOnAction(e -> {
  
        });
        
        moreButton.setOnAction(e -> {

        });
        */
        
        // set the title of the home page and set it to maximized and show
        primaryStage.setTitle("Math.com");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
  
    }      
    // function to get left border pane buttons
    public Button getLeftButton(String title, ImageView iv)
    {
        Button button = new Button(title);
        button.setMinSize(200, 50);
        button.setFont(Font.font("Serif", 24));
        button.setStyle(getSubjectMenuNH());
        
        setHovering(button, getSubjectMenuH(), iv);
        setNoHovering(button, getSubjectMenuNH(), iv);
        return button;
    }
    
    //function to get right border pane buttons
    public Button getRightButton(String title, ImageView iv)
    {
        Button button = new Button(title);
        button.setMinSize(200, 50);
        button.setFont(Font.font("Serif",25));
        button.setStyle(getAssMenuNH());
        
        setHovering(button, getAssMenuH(), iv);
        setNoHovering(button, getAssMenuNH(), iv);
        return button;
    }
    
    //function to get top border pane buttons
    public Button getTopButton(String title)
    {
        Button button = new Button(title);
        button.setMinSize(200, 50);
        button.setFont(Font.font("Serif", 25));
        button.setStyle(getMainMenuNH());
        
        setHovering(button, getMainMenuH());
        setNoHovering(button, getMainMenuNH());
        return button;
    }
    
    // function to get an image view that will be sized for smaller icons
    public ImageView getIconImageView(Image image)
    {
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);
        return imageView;
    }
    // function to get an image view that will be sized for mathematician portraits
    public ImageView getMathematicianImageView(Image image)
    {
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(150);
        imageView.setSmooth(true);
        imageView.setCache(true);
        return imageView;
    }
    // function to get an HBox that has an icon on the left and button on the right
    public HBox getIconHBox(ImageView imageView, Button button)
    {
        HBox hBox = new HBox();
        hBox.getChildren().addAll(imageView, button);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        return hBox;
    }
    
    // function to get an HBox that has a mathematician quote and portrait
    public HBox getMathematicianHBox(Label label, ImageView imageView)
    {
        HBox hBox = new HBox(label, imageView);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(20);
        return hBox;
    }
   
    // function to create a quote label of a mathematician
    public Label getQuoteLabel(String text)
    {
        Label label = new Label(text);
        label.setFont(Font.font("Serif",20));
        label.setWrapText(true);
        return label;
    }
    
    // function to create a name label of a mathematician
    public Label getNameLabel(String text)
    {
        Label label = new Label (text);
        label.setFont(Font.font("Serif",20));
        label.setWrapText(true);
        return label;
    }
    // function to get a hyperlink for the top border pane teachers button section
    public Hyperlink getTeacherHyperlink(String text)
    {
        Hyperlink hyperlink = new Hyperlink(text);
        hyperlink.setFont(Font.font("Serif", 40));
        hyperlink.setTextFill(Color.BLUE);
        hyperlink.setUnderline(true);
        return hyperlink;
    }
    
    // function to get a hyperlink for the top border pane parents button section
    public Hyperlink getParentHyperlink(String text)
    {
        Hyperlink hyperlink = new Hyperlink(text);
        hyperlink.setFont(Font.font("Serif", 40));
        hyperlink.setTextFill(Color.BLUE);
        hyperlink.setUnderline(true);
        return hyperlink;
    }
    // function to get a glossary hyperlink, which will change the glossaryDefinition label to
    // the respective text of the clicked definition when clicked on
    public Hyperlink getGlossaryHyperlink(String name, Label definition, Label glossaryDefinition)
    {
        Hyperlink hyperlink = new Hyperlink(name);
        hyperlink.setFont(Font.font("Serif",20));
        hyperlink.setTextFill(Color.BLUE);
        hyperlink.setOnAction(e -> {
            glossaryDefinition.setText(definition.getText());
            glossaryDefinition.setFont(Font.font("Serif",25));
        });
        return hyperlink;
    }
    
    // function to get the current selection of the choicebox then update accordingly
    public void update(ChoiceBox<String> choiceBox,VBox center)
    {
        String selection = choiceBox.getValue();
        switch(selection)
        {
            case "Basic Math":
                center.getChildren().clear();
              
        }
        
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    // CSS formats for the buttons.
    public static String getSubjectMenuNH(){
        return "-fx-background-color: linear-gradient(#f0ff35, #a9ff00),radial-gradient(center 50% -40%, radius 200%, #b8ee36 45%, #80c800 50%);-fx-background-radius: 6, 5;-fx-background-insets: 0, 1;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );-fx-text-fill: #395306;";
    }
    
    public static String getSubjectMenuH(){
        return "-fx-background-color: linear-gradient(#f0ff35, #a9ff00);-fx-background-radius: 6, 5;-fx-background-insets: 0, 1;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );-fx-text-fill: #395000;";
    }
    
    public static String getAssMenuNH(){
        return "-fx-background-color: linear-gradient(#6BAEFA , #9AC7FA ),radial-gradient(center 50% -40%, radius 200%, #6BAEFA  45%, #2B8DFC   50%);-fx-background-radius: 6, 5;-fx-background-insets: 0, 1;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );-fx-text-fill: #395306;";
    }
    
    public static String getAssMenuH(){
        return "-fx-background-color: linear-gradient(#6BAEFA, #C3DDFB );-fx-background-radius: 6, 5;-fx-background-insets: 0, 1;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );-fx-text-fill: #395000;";
    }
    
    public static String getMainMenuNH(){
        return "-fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),linear-gradient(#020b02, #3a3a3a),linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30;-fx-font-family: \"Helvetica\";-fx-font-size: 18px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);";
    }
    
    public static String getMainMenuH(){
        return "-fx-background-color: linear-gradient(#232723 0%, #686868 25%, #373837 75%, #757575 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30;-fx-font-family: \"Helvetica\";-fx-font-size: 18px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);";
    }
    
    // EventHanadlers for mouse hovering over a button.
    // button(Button): the button to be assigned the handler.
    // style(String): the string holding the style.
    // iv(ImageView): the ImageView linked with the Button argument.
    public static void setHovering(Button button, String style, ImageView iv){
        button.setOnMouseEntered(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                button.setStyle(style);
                iv.setOpacity(.3);
            }
        });
    }
    
    // EventHanadlers for mouse not hovering over a button.
    // button(Button): the button to be assigned the handler.
    // style(String): the string holding the style.
    // iv(ImageView): the ImageView linked with the Button argument.
    public static void setNoHovering(Button button, String style, ImageView iv){
        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                button.setStyle(style);
                iv.setOpacity(1.0);
            }
        });
    }
    
    // Overloaded method for setHovering().
    // Reason: top menu Buttons in GUI don't have ImageView/s linked with them
    // ... so, cannot send an ImageView to the above method.
    // All parameters in setHovering() are used for the same purpose, 
    // ... excluding the iv ImageView.
    public static void setHovering(Button button, String style){
        button.setOnMouseEntered(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                button.setStyle(style);
            }
        });
    }
    
    // Overloaded method for setNoHovering().
    // Reason: top menu Buttons in GUI don't have ImageView/s linked with them
    // ... so, cannot send an ImageView to the above method.
    // All parameters in setNoHovering() are used for the same purpose, 
    // ... excluding the iv ImageView.
    public static void setNoHovering(Button button, String style){
        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                button.setStyle(style);
            }
        });
    }
    
    /*
    public static void glossaryAdaption(Button button){
        if (button.getText() == "Glossary"){
            
        }
            
    }*/
}




