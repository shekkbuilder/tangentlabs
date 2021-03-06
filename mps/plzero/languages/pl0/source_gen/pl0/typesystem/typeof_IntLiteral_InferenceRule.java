package pl0.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;

public class typeof_IntLiteral_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_IntLiteral_InferenceRule() {
  }

  public void applyRule(final SNode val, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = val;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:49c438d0-a706-4bf5-b540-7b1b998310bd(pl0.typesystem)", "714196159579137460", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:49c438d0-a706-4bf5-b540-7b1b998310bd(pl0.typesystem)", "714196159579132467", true), (SNode) typeCheckingContext.typeOf(createTInteger_9iby9e_a0a0a1(), "r:49c438d0-a706-4bf5-b540-7b1b998310bd(pl0.typesystem)", "714196159579152131", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "pl0.structure.IntLiteral";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  private static SNode createTInteger_9iby9e_a0a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration("pl0.structure.TInteger", null, GlobalScope.getInstance(), false);
    return n1;
  }
}
