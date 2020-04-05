package klondike.game

import org.scalajs.dom.html
import pixiscalajs.PIXI
import pixiscalajs.PIXI.{Pixi, RendererOptions}
import pixiscalajs.extensions._

import scala.scalajs.js.annotation.{JSExportTopLevel, JSExport}
import scala.util.Random


@JSExportTopLevel("klondike.game.KlondikeGame")
class KlondikeGame {

  var world : World = null

  @JSExport
  def main(canvas: html.Canvas): Unit = {
    println("Loading renderer")
    val renderer = new PIXI.CanvasRenderer(1600,1080, RendererOptions(canvas))

    println("Creating world2")

    val ship = Ship(800, 600)

    world = new World(renderer, ship)
    world.add(ship)

    for(a <- 1 to 10){
      world.add(Asteroid(Random.nextInt(1600), Random.nextInt(1080)))
    }

    world.loop.run()
  }

}

object KlondikeGame {

  final val RESOURCES_ROOT = "images"

}
