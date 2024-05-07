# javafx-demo-projects

A multi-module Maven project that contains all the reusable components. Feel free to reuse their code snippets in the homework project.

## Usage

Each example has its submodule. You can choose the desired project in Maven using the flag `-pl`. Some projects also contain multiple examples; you can switch between them using the flag `-P` since each example has its profile.

The parent project defines the possible dependencies (including their versions) in the `dependencyManagement` element. The plugins are defined in the parent project too. Thus, a submodule should just define what dependencies and plugins should be used without specifying the `version` elements. However, you can override the inherited versions redefining the corresponding `property` elements.

## Basic Examples 

These projects do not contain any UI elements; they just demonstrate the usage of dependency `javafx-base`.

1. [`javafx-binding-example`](./javafx-binding-example/)

    An example project that demonstrates how to work with the binding API in [JavaFX](https://openjfx.io/).


## Non-MVC examples

These projects focus on special use cases of JavaFX without adding a business logic that follows the MVC pattern.

1. [`javafx-hello`](./javafx-hello)

    [JavaFX](https://openjfx.io/) "Hello, World!" program. 
    
    *As this project is not MVC, we do not recommend using it in your homework project.*

1. [`javafx-imageview-example`](./javafx-imageview-example/)

    An example project that demonstrates how to display an image in
[JavaFX](https://openjfx.io/) with the [ImageView](https://openjfx.io/javadoc/20/javafx.graphics/javafx/scene/image/ImageView.html) class.

1. [`javafx-imageview-stacking-example`](./javafx-imageview-stacking-example/)

    An example project that demonstrates how to display multiple transparent images on
the top of each other in [JavaFX](https://openjfx.io/) with the
[ImageView](https://openjfx.io/javadoc/18/javafx.graphics/javafx/scene/image/ImageView.html) class.

## MVC examples

### Board game-related examples

1. [`javafx-board-game-example1`](./javafx-board-game-example1/)

    An example project that demonstrates how to implement a board game in [JavaFX](https://openjfx.io/).

1. [`javafx-board-game-example2`](./javafx-board-game-example2/)

    An example project that demonstrates how to implement a board game in [JavaFX](https://openjfx.io/).

1. [`javafx-board-game-example2-game-over`](./javafx-board-game-example2-game-over/)

    Example project that demonstrates how to implement a board game in [JavaFX](https://openjfx.io/).

1. [`javafx-board-game-example3`](./javafx-board-game-example3/)

    An example project that demonstrates how to implement a board game in [JavaFX](https://openjfx.io/).

1. [`javafx-board-game-example4`](./javafx-board-game-example4/)

    An example project that demonstrates how to implement a board game in [JavaFX](https://openjfx.io/).

### Miscellaneous examples

1. [`javafx-fxml-hello`](./javafx-fxml-hello/)

    [JavaFX](https://openjfx.io/) "Hello, World!" program using [FXML](https://openjfx.io/javadoc/20/javafx.fxml/javafx/fxml/doc-files/introduction_to_fxml.html).


1. [`javafx-converter-example`](./javafx-converter-example/)

    A simple number converter, written in [JavaFX](https://openjfx.io/).

1. [`javafx-clock-example`](./javafx-clock-example/)

    An example project that demonstrates how to display the current time in [JavaFX](https://openjfx.io/).

1. [`javafx-data-pass-example`](./javafx-data-pass-example/)

    An example project that demonstrates how to pass data between [JavaFX](https://openjfx.io/) controllers.

1. [`javafx-editor-example`](./javafx-editor-example/)

    Simple text editor written in [JavaFX](https://openjfx.io/).

1. [`javafx-property-example`](./javafx-property-example/)

    An example project that demonstrates how to work with properties in [JavaFX](https://openjfx.io/).

1. [`javafx-scene-switch-example`](./javafx-scene-switch-example/)

    An example project that demonstrates how to switch between scenes in [JavaFX](https://openjfx.io/).

1. [`javafx-stopwatch-example`](./javafx-stopwatch-example/)

    Stopwatch with start, stop, and reset functionality written in [JavaFX](https://openjfx.io/).

1. [`javafx-tableview-example`](./javafx-tableview-example/)

    Example project that demonstrates how to display data in tabular format in
[JavaFX](https://openjfx.io/) with the [TableView](https://openjfx.io/javadoc/20/javafx.controls/javafx/scene/control/TableView.html) class.
