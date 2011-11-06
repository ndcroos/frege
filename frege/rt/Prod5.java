/* «•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»

    Copyright © 2011, Ingo Wechsung
    All rights reserved.

    Redistribution and use in source and binary forms, with or
    without modification, are permitted provided that the following
    conditions are met:

        Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.

        Redistributions in binary form must reproduce the above
        copyright notice, this list of conditions and the following
        disclaimer in the documentation and/or other materials provided
        with the distribution. Neither the name of the copyright holder
        nor the names of its contributors may be used to endorse or
        promote products derived from this software without specific
        prior written permission.

    THIS SOFTWARE IS PROVIDED BY THE
    COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
    IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
    WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
    PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER
    OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
    SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
    LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
    USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
    AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
    LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
    IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
    THE POSSIBILITY OF SUCH DAMAGE.

    «•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•»«•» */

package frege.rt;
// $Author$
// $Date$
// $Rev$
// $Id$
/**
 * <p> Base class for values constructed with 5-ary constructors. </p>
 *
 * <p> This will be extended by constructors of sum types and by product types.
 *  Subclasses can overwrite the {@link FV#constructor} method.
 * </p>
 *
 * <p> Note that Prod<sub><em>5</em></sub> is not a subclass of Prod<sub><em>4</em></sub>! </p>
 */
public class Prod5 extends Val {
    /** <p>Field 1 </p> */
    public final Lazy<FV> mem1;
    public final static Lazy<FV> get1(Lazy<FV> p) {
        return ((Prod5) p._e()).mem1;
    }
    public final static MH mhget1 = new MH (
        MH.findStatic(Prod5.class, "get1", MH.mtLL));
    /** <p>Field 2 </p> */
    public final Lazy<FV> mem2;
    public final static Lazy<FV> get2(Lazy<FV> p) {
        return ((Prod5) p._e()).mem2;
    }
    public final static MH mhget2 = new MH (
        MH.findStatic(Prod5.class, "get2", MH.mtLL));
    /** <p>Field 3 </p> */
    public final Lazy<FV> mem3;
    public final static Lazy<FV> get3(Lazy<FV> p) {
        return ((Prod5) p._e()).mem3;
    }
    public final static MH mhget3 = new MH (
        MH.findStatic(Prod5.class, "get3", MH.mtLL));
    /** <p>Field 4 </p> */
    public final Lazy<FV> mem4;
    public final static Lazy<FV> get4(Lazy<FV> p) {
        return ((Prod5) p._e()).mem4;
    }
    public final static MH mhget4 = new MH (
        MH.findStatic(Prod5.class, "get4", MH.mtLL));
    /** <p>Field 5 </p> */
    public final Lazy<FV> mem5;
    public final static Lazy<FV> get5(Lazy<FV> p) {
        return ((Prod5) p._e()).mem5;
    }
    public final static MH mhget5 = new MH (
        MH.findStatic(Prod5.class, "get5", MH.mtLL));
    /** <p> Constructor. </p> */
    protected Prod5(final Lazy<FV> arg1,final Lazy<FV> arg2,final Lazy<FV> arg3,final Lazy<FV> arg4,final Lazy<FV> arg5) {
        mem1 = arg1;
        mem2 = arg2;
        mem3 = arg3;
        mem4 = arg4;
        mem5 = arg5;
    }
}
