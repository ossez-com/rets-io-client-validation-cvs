/* $Header: /usr/local/cvsroot/rets/validation/src/org/realtor/rets/validation/operators/ModOperator.java,v 1.2 2003/12/04 15:28:33 rsegelman Exp $  */
package org.realtor.rets.validation.operators;

import org.realtor.rets.validation.terms.InvalidTermException;
import org.realtor.rets.validation.terms.NumericTerm;
import org.realtor.rets.validation.terms.Term;
import org.realtor.rets.validation.terms.TermConverter;


/**
 *  ModOperator.java Created Sep 24, 2003
 *
 *
 *  Copyright 2003, Avantia inc.
 *  @version $Revision: 1.2 $
 *  @author scohen
 */
public class ModOperator extends Operator {
    public ModOperator() {
        symbol = ".MOD.";
        setPrecedence(1);
    }

    /* (non-Javadoc)
     * @see org.realtor.rets.validation.operators.Operator#apply(org.realtor.rets.validation.terms.Term, org.realtor.rets.validation.terms.Term)
     */
    public Term apply(Term t1, Term t2) throws InvalidTermException {
        NumericTerm i1;
        NumericTerm i2;
        i1 = TermConverter.toNumericTerm(t1);
        i2 = TermConverter.toNumericTerm(t2);

        Double l1;
        Double l2;
        l1 = (Double) i1.getValue();
        l2 = (Double) i2.getValue();

        return new NumericTerm(l1.doubleValue() % l2.doubleValue());
    }
}
