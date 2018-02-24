package com.code42.hashcodepizza;

import com.code42.hashcodepizza.io.RequestReader;
import com.code42.hashcodepizza.io.SolutionWriter;
import com.code42.hashcodepizza.solver.impl.FullSliceSolverImpl;
import com.code42.hashcodepizza.solver.Solver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * radu on 2/24/18 3:21 PM
 */
public class Mind {

    private RequestReader reader;
    private Solver solver;

    public Mind() {
        reader = new RequestReader();
        solver = new FullSliceSolverImpl();
    }

    public void doYouMagic(InputStream in, OutputStream out) throws IOException {
        SolutionWriter writer = new SolutionWriter(out);
        solver.solve(reader.read(in), writer);
    }
}
