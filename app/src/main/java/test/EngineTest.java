package test;

import android.test.InstrumentationTestCase;

import projecht.terra_valrose.Engine;
import projecht.terra_valrose.MainActivity;
import projecht.terra_valrose.Position;

public class EngineTest extends InstrumentationTestCase {

    Engine engine;
    MainActivity m;
    Position p;

    public void testGetFrameByPosition(){

        m = new MainActivity();
        engine = new Engine(m);
        engine.buildListFrame();

        p = new Position(1,1);

        assertEquals(engine.getListFrame().get(0), engine.getFrameByPosition(p));

    }
}