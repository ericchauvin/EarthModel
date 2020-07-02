// Copyright Eric Chauvin 2019 - 2020.


/*

Make a clock on a spaceship.  On each space ship.
Sailing ship with a vertical mast.  Light
goes from the bottom to the top and bounces
back down again.  That's a clock.  But
the light moves in a diagonal direction
for an observer.  That diagonal direction
is the hypotenuse.  What is that distance
the light travels?  Light travels at
the same speed for any observer.  So
how far did it go?  How long did it take
to travel it?

And compare that clock to Minkowski
stuff for testing each clock.


Get this data so I'll know what kind of
grids I need to use.

Climate Data:
https://www.ncdc.noaa.gov/data-access/model-data/model-datasets/numerical-weather-prediction


Climate a weather data:
https://www.ncdc.noaa.gov/data-access/model-data


How big are those moons of Jupiter and
Saturn?  How much mass?


reciprocal vectors


https://www.depts.ttu.edu/csc/


https://en.wikipedia.org/wiki/Covariant_derivative


Longitude: "Measuring from the intersection of the ecliptic with the equator."

https://en.wikipedia.org/wiki/Direct_Rendering_Manager


https://en.wikipedia.org/wiki/Geodesy


That single array of data that can be run under one thread.  Call it a CoordinateCurve.  Or DataCurve?
Local coordinates at points on the curve.


Get the distance from the viewer to the Earth and put up the
detailed drawn image when it's close.

Calculate sunrise/sunset for a particular lat/lon location.

Space station current coordinates:
http://www.esa.int/Our_Activities/Human_Spaceflight/International_Space_Station/Where_is_the_International_Space_Station



Check on this in the EarthGeoid.cs file:
And that bit map file drawing thing too.
  private DrawingBrush SetTextureDrawingBrush()


// Simplex:
// https://en.wikipedia.org/wiki/Simplex


// Convex set:
// https://en.wikipedia.org/wiki/Convex_set

// The sun has about 99.8 percent of the mass
// of the Solar System.  Most of the rest of the
// mass is in Jupiter.



https://nationalmap.gov/small_scale/atlas-ftp-global-map.html?openChapters=chpgeol#chpgeol




// Elevation data:
// Band-Interleaved-by-Line (BIL) format
// http://desktop.arcgis.com/en/arcmap/10.3/manage-data/raster-and-images/bil-bip-and-bsq-raster-files.htm

// the Global Spatial Data Infrastructure.
// gsdiassociation.org/

// https://visibleearth.nasa.gov/


// Weather models:
// https://en.wikipedia.org/wiki/Numerical_weather_prediction


Put a texture on a tetrahedron and draw on it.


*/


// Earth Model



import javax.swing.SwingUtilities;



public class MainApp implements Runnable
  {
  public static final String versionDate = "7/1/2020";
  private MainWindow mainWin;
  // public ConfigureFile mainConfigFile;
  private String[] argsArray;



  public static void main( String[] args )
    {
    MainApp mApp = new MainApp( args );
    SwingUtilities.invokeLater( mApp );
    }



  @Override
  public void run()
    {
    setupProgram();
    }



  private MainApp()
    {
    }


  public MainApp( String[] args )
    {
    argsArray = args;
    }



  private void setupProgram()
    {
    // checkSingleInstance()
 
    /*
    String programDirectory = "\\Eric\\CPreprocessor\\";
    int length = argsArray.length;
    if( length > 0 )
      programDirectory = argsArray[0];

    String mainConfigFileName = programDirectory +
                                      "MainConfigure.txt";

    mainConfigFile = new ConfigureFile( this,
                                mainConfigFileName );
    */

    mainWin = new MainWindow( this, "C Preprocessor" );
    mainWin.initialize();

    /*
    showStatus( " " );
    showStatus( "argsArray length: " + length );
    for( int count = 0; count < length; count++ )
      showStatus( argsArray[count] );
    */

    // showStatus( " " );
    }



  public void showStatusAsync( String toShow )
    {
    if( mainWin == null )
      return;

    mainWin.showStatusAsync( toShow );
    }


/*
  public void showStatus( String toShow )
    {
    if( mainWin == null )
      return;

    mainWin.showStatus( toShow );
    }
*/


  public void clearStatus()
    {
    if( mainWin == null )
      return;

    mainWin.clearStatus();
    }




  }

