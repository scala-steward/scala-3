/**
Defines implicit [[org.scalacheck.Arbitrary]] instances for tuples and functions

Autogenerated using tools/codegen.sh
*/
package org.scalacheck

private[scalacheck] trait ArbitraryArities{
  // Functions //
  
  /** Arbitrary instance of Function1 */
  implicit def arbFunction1[T1,Z](implicit g: Arbitrary[Z], co1: Cogen[T1]): Arbitrary[(T1) => Z] =
    Arbitrary(Gen.function1(g.arbitrary))

  /** Arbitrary instance of Function2 */
  implicit def arbFunction2[T1,T2,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2]): Arbitrary[(T1,T2) => Z] =
    Arbitrary(Gen.function2(g.arbitrary))

  /** Arbitrary instance of Function3 */
  implicit def arbFunction3[T1,T2,T3,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3]): Arbitrary[(T1,T2,T3) => Z] =
    Arbitrary(Gen.function3(g.arbitrary))

  /** Arbitrary instance of Function4 */
  implicit def arbFunction4[T1,T2,T3,T4,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4]): Arbitrary[(T1,T2,T3,T4) => Z] =
    Arbitrary(Gen.function4(g.arbitrary))

  /** Arbitrary instance of Function5 */
  implicit def arbFunction5[T1,T2,T3,T4,T5,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5]): Arbitrary[(T1,T2,T3,T4,T5) => Z] =
    Arbitrary(Gen.function5(g.arbitrary))

  /** Arbitrary instance of Function6 */
  implicit def arbFunction6[T1,T2,T3,T4,T5,T6,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6]): Arbitrary[(T1,T2,T3,T4,T5,T6) => Z] =
    Arbitrary(Gen.function6(g.arbitrary))

  /** Arbitrary instance of Function7 */
  implicit def arbFunction7[T1,T2,T3,T4,T5,T6,T7,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7) => Z] =
    Arbitrary(Gen.function7(g.arbitrary))

  /** Arbitrary instance of Function8 */
  implicit def arbFunction8[T1,T2,T3,T4,T5,T6,T7,T8,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8) => Z] =
    Arbitrary(Gen.function8(g.arbitrary))

  /** Arbitrary instance of Function9 */
  implicit def arbFunction9[T1,T2,T3,T4,T5,T6,T7,T8,T9,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9) => Z] =
    Arbitrary(Gen.function9(g.arbitrary))

  /** Arbitrary instance of Function10 */
  implicit def arbFunction10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) => Z] =
    Arbitrary(Gen.function10(g.arbitrary))

  /** Arbitrary instance of Function11 */
  implicit def arbFunction11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) => Z] =
    Arbitrary(Gen.function11(g.arbitrary))

  /** Arbitrary instance of Function12 */
  implicit def arbFunction12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) => Z] =
    Arbitrary(Gen.function12(g.arbitrary))

  /** Arbitrary instance of Function13 */
  implicit def arbFunction13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) => Z] =
    Arbitrary(Gen.function13(g.arbitrary))

  /** Arbitrary instance of Function14 */
  implicit def arbFunction14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) => Z] =
    Arbitrary(Gen.function14(g.arbitrary))

  /** Arbitrary instance of Function15 */
  implicit def arbFunction15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) => Z] =
    Arbitrary(Gen.function15(g.arbitrary))

  /** Arbitrary instance of Function16 */
  implicit def arbFunction16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15],co16: Cogen[T16]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) => Z] =
    Arbitrary(Gen.function16(g.arbitrary))

  /** Arbitrary instance of Function17 */
  implicit def arbFunction17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15],co16: Cogen[T16],co17: Cogen[T17]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) => Z] =
    Arbitrary(Gen.function17(g.arbitrary))

  /** Arbitrary instance of Function18 */
  implicit def arbFunction18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15],co16: Cogen[T16],co17: Cogen[T17],co18: Cogen[T18]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) => Z] =
    Arbitrary(Gen.function18(g.arbitrary))

  /** Arbitrary instance of Function19 */
  implicit def arbFunction19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15],co16: Cogen[T16],co17: Cogen[T17],co18: Cogen[T18],co19: Cogen[T19]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) => Z] =
    Arbitrary(Gen.function19(g.arbitrary))

  /** Arbitrary instance of Function20 */
  implicit def arbFunction20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15],co16: Cogen[T16],co17: Cogen[T17],co18: Cogen[T18],co19: Cogen[T19],co20: Cogen[T20]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) => Z] =
    Arbitrary(Gen.function20(g.arbitrary))

  /** Arbitrary instance of Function21 */
  implicit def arbFunction21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15],co16: Cogen[T16],co17: Cogen[T17],co18: Cogen[T18],co19: Cogen[T19],co20: Cogen[T20],co21: Cogen[T21]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) => Z] =
    Arbitrary(Gen.function21(g.arbitrary))

  /** Arbitrary instance of Function22 */
  implicit def arbFunction22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,Z](implicit g: Arbitrary[Z], co1: Cogen[T1],co2: Cogen[T2],co3: Cogen[T3],co4: Cogen[T4],co5: Cogen[T5],co6: Cogen[T6],co7: Cogen[T7],co8: Cogen[T8],co9: Cogen[T9],co10: Cogen[T10],co11: Cogen[T11],co12: Cogen[T12],co13: Cogen[T13],co14: Cogen[T14],co15: Cogen[T15],co16: Cogen[T16],co17: Cogen[T17],co18: Cogen[T18],co19: Cogen[T19],co20: Cogen[T20],co21: Cogen[T21],co22: Cogen[T22]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) => Z] =
    Arbitrary(Gen.function22(g.arbitrary))


  // Tuples //
  
  /** Arbitrary instance of 1-Tuple */
  implicit def arbTuple1[T1](implicit
    a1:Arbitrary[T1]
  ): Arbitrary[Tuple1[T1]]
    = Arbitrary(a1.arbitrary.map(Tuple1(_)))

  /** Arbitrary instance of 2-Tuple */
  implicit def arbTuple2[T1,T2](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2]
  ): Arbitrary[Tuple2[T1,T2]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary))

  /** Arbitrary instance of 3-Tuple */
  implicit def arbTuple3[T1,T2,T3](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3]
  ): Arbitrary[Tuple3[T1,T2,T3]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary))

  /** Arbitrary instance of 4-Tuple */
  implicit def arbTuple4[T1,T2,T3,T4](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4]
  ): Arbitrary[Tuple4[T1,T2,T3,T4]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary))

  /** Arbitrary instance of 5-Tuple */
  implicit def arbTuple5[T1,T2,T3,T4,T5](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5]
  ): Arbitrary[Tuple5[T1,T2,T3,T4,T5]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary))

  /** Arbitrary instance of 6-Tuple */
  implicit def arbTuple6[T1,T2,T3,T4,T5,T6](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6]
  ): Arbitrary[Tuple6[T1,T2,T3,T4,T5,T6]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary))

  /** Arbitrary instance of 7-Tuple */
  implicit def arbTuple7[T1,T2,T3,T4,T5,T6,T7](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7]
  ): Arbitrary[Tuple7[T1,T2,T3,T4,T5,T6,T7]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary))

  /** Arbitrary instance of 8-Tuple */
  implicit def arbTuple8[T1,T2,T3,T4,T5,T6,T7,T8](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8]
  ): Arbitrary[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary))

  /** Arbitrary instance of 9-Tuple */
  implicit def arbTuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9]
  ): Arbitrary[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary))

  /** Arbitrary instance of 10-Tuple */
  implicit def arbTuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10]
  ): Arbitrary[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary))

  /** Arbitrary instance of 11-Tuple */
  implicit def arbTuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11]
  ): Arbitrary[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary))

  /** Arbitrary instance of 12-Tuple */
  implicit def arbTuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12]
  ): Arbitrary[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary))

  /** Arbitrary instance of 13-Tuple */
  implicit def arbTuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13]
  ): Arbitrary[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary))

  /** Arbitrary instance of 14-Tuple */
  implicit def arbTuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14]
  ): Arbitrary[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary))

  /** Arbitrary instance of 15-Tuple */
  implicit def arbTuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15]
  ): Arbitrary[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary))

  /** Arbitrary instance of 16-Tuple */
  implicit def arbTuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16]
  ): Arbitrary[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary,a16.arbitrary))

  /** Arbitrary instance of 17-Tuple */
  implicit def arbTuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17]
  ): Arbitrary[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary,a16.arbitrary,a17.arbitrary))

  /** Arbitrary instance of 18-Tuple */
  implicit def arbTuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18]
  ): Arbitrary[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary,a16.arbitrary,a17.arbitrary,a18.arbitrary))

  /** Arbitrary instance of 19-Tuple */
  implicit def arbTuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19]
  ): Arbitrary[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary,a16.arbitrary,a17.arbitrary,a18.arbitrary,a19.arbitrary))

  /** Arbitrary instance of 20-Tuple */
  implicit def arbTuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20]
  ): Arbitrary[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary,a16.arbitrary,a17.arbitrary,a18.arbitrary,a19.arbitrary,a20.arbitrary))

  /** Arbitrary instance of 21-Tuple */
  implicit def arbTuple21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21]
  ): Arbitrary[Tuple21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary,a16.arbitrary,a17.arbitrary,a18.arbitrary,a19.arbitrary,a20.arbitrary,a21.arbitrary))

  /** Arbitrary instance of 22-Tuple */
  implicit def arbTuple22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21], a22:Arbitrary[T22]
  ): Arbitrary[Tuple22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]]
    = Arbitrary(Gen.zip(a1.arbitrary,a2.arbitrary,a3.arbitrary,a4.arbitrary,a5.arbitrary,a6.arbitrary,a7.arbitrary,a8.arbitrary,a9.arbitrary,a10.arbitrary,a11.arbitrary,a12.arbitrary,a13.arbitrary,a14.arbitrary,a15.arbitrary,a16.arbitrary,a17.arbitrary,a18.arbitrary,a19.arbitrary,a20.arbitrary,a21.arbitrary,a22.arbitrary))

}