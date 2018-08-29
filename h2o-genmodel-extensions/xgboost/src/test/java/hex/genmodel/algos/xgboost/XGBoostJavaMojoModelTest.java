package hex.genmodel.algos.xgboost;

import org.junit.Test;

import static org.junit.Assert.*;

public class XGBoostJavaMojoModelTest {

  @Test
  public void testObjFunction() { // make sure we have implementation for all supported obj functions
    for (XGBoostMojoModel.ObjectiveType type : XGBoostMojoModel.ObjectiveType.values()) {
      assertNotNull(XGBoostJavaMojoModel.getObjFunction(type.getId()));
    }
  }

}