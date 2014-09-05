# slides2-lein-template

Creates a sceleton presentation using slides2

## Usage

I did not put this to a repo like clojars yet, so for the moment you have to start with a ```lein install```.

Then do ```lein new slides2-lein-template my-presentation```

To build the presentation run ```lein cljsbuild auto```.

To present, open ```resources/public/index.html``` in your browser and enter fullscreen mode.

Use the ```left``` and ```right``` arrow keys to navigate back and forth.

To add your own content modify the presentation in ```main.cljs```

## License

Copyright © 2014 Christian Stamm

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
