package com.code42.hashcodepizza.solver;

import com.code42.hashcodepizza.io.SolutionWriter;
import com.code42.hashcodepizza.model.RequestModel;

/**
 * radu on 2/24/18 3:20 PM
 */
public interface Solver {

    void solve(RequestModel requestModel, SolutionWriter writer);
}
