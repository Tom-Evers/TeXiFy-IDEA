// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.rubensten.texifyidea.psi.LatexTypes.*;
import nl.rubensten.texifyidea.psi.LatexEnvironmentMixin;
import nl.rubensten.texifyidea.psi.*;

public class LatexEnvironmentImpl extends LatexEnvironmentMixin implements LatexEnvironment {

  public LatexEnvironmentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitEnvironment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatexBeginCommand getBeginCommand() {
    return findNotNullChildByClass(LatexBeginCommand.class);
  }

  @Override
  @NotNull
  public LatexEndCommand getEndCommand() {
    return findNotNullChildByClass(LatexEndCommand.class);
  }

  @Override
  @Nullable
  public LatexEnvironmentContent getEnvironmentContent() {
    return findChildByClass(LatexEnvironmentContent.class);
  }

}
