/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

/* Исправил ответ*/

public class Main {
    public static void main(String[] args) {
        String eights = "8888888888";
        char[] acht10 = new char[10];
        for (int i = 1; i<=10;i++) {
            eights.getChars(0, i, acht10, 0);
            System.out.println(acht10);
        }
    }
}




/* Мемориал */

/* public class Main {

    public static void main(String[] args) {
        for (int i = 8; i < 9; i++) {
            System.out.println(i);
        }
        for (int j = 8; j < 9; j++) {
            for (int j2 = 8; j2 < 9; j2++) {
                System.out.println(j+""+j2);
            }
        }
        for (int k = 8; k < 9; k++) {
            for (int k2 = 8; k2 < 9; k2++) {
                for (int k3 = 8; k3 < 9; k3++) {
                    System.out.println(k+""+k3+""+k3);
                }
            }
        }
        for (int l = 8; l < 9; l++) {
            for (int l2 = 8; l2 < 9; l2++) {
                for (int l3 = 8; l3 < 9; l3++) {
                    for (int l4 = 8; l4 < 9; l4++) {
                        System.out.println(l+""+l2+""+l3+""+l4);
                    }
                }
            }
        }
        for (int m = 8; m < 9; m++) {
            for (int m2 = 8; m2 < 9; m2++) {
                for (int m3 = 8; m3 < 9; m3++) {
                    for (int m4 = 8; m4 < 9; m4++) {
                        for (int m5 = 8; m5 < 9; m5++) {
                            System.out.println(m+""+m2+""+m3+""+m4+""+m5);
                        }
                    }
                }
            }
        }
        for (int n = 8; n < 9; n++) {
            for (int n2 = 8; n2 < 9; n2++) {
                for (int n3 = 8; n3 < 9; n3++) {
                    for (int n4 = 8; n4 < 9; n4++) {
                        for (int n5 = 8; n5 < 9; n5++) {
                            for (int n6 = 8; n6 < 9; n6++) {
                                System.out.println(n+""+n2+""+n3+""+n4+""+n5+""+n6);
                            }
                        }
                    }
                }
            }
        }
        for (int o = 8; o < 9; o++) {
            for (int o2 = 8; o2 < 9; o2++) {
                for (int o3 = 8; o3 < 9; o3++) {
                    for (int o4 = 8; o4 < 9; o4++) {
                        for (int o5 = 8; o5 < 9; o5++) {
                            for (int o6 = 8; o6 < 9; o6++) {
                                for (int o7 = 8; o7 < 9; o7++) {
                                    System.out.println(o+""+o2+""+o3+""+o4+""+o5+""+o6+""+o7+"");
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int p = 8; p < 9; p++) {
            for (int p2 = 8; p2 < 9; p2++) {
                for (int p3 = 8; p3 < 9; p3++) {
                    for (int p4 = 8; p4 < 9; p4++) {
                        for (int p5 = 8; p5 < 9; p5++) {
                            for (int p6 = 8; p6 < 9; p6++) {
                                for (int p7 = 8; p7 < 9; p7++) {
                                    for (int p8 = 8; p8 < 9; p8++) {
                                        System.out.println(p+""+p2+""+p3+""+p4+""+p5+""+p6+""+p7+""+p8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int q = 8; q < 9; q++) {
            for (int q2 = 8; q2 < 9; q2++) {
                for (int q3 = 8; q3 < 9; q3++) {
                    for (int q4 = 8; q4 < 9; q4++) {
                        for (int q5 = 8; q5 < 9; q5++) {
                            for (int q6 = 8; q6 < 9; q6++) {
                                for (int q7 = 8; q7 < 9; q7++) {
                                    for (int q8 = 8; q8 < 9; q8++) {
                                        for (int q9 = 8; q9 < 9; q9++) {
                                            System.out.println(q+""+q2+""+q3+""+q4+""+q5+""+q6+""+q7+""+q8+""+q9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int r = 8; r < 9; r++) {
            for (int r2 = 8; r2 < 9; r2++) {
                for (int r3 = 8; r3 < 9; r3++) {
                    for (int r4 = 8; r4 < 9; r4++) {
                        for (int r5 = 8; r5 < 9; r5++) {
                            for (int r6 = 8; r6 < 9; r6++) {
                                for (int r7 = 8; r7 < 9; r7++) {
                                    for (int r8 = 8; r8 < 9; r8++) {
                                        for (int r9 = 8; r9 < 9; r9++) {
                                            for (int r10 = 8; r10 < 9; r10++) {
                                                System.out.println(r+""+r2+""+r3+""+r4+""+r5+""+r6+""+r7+""+r8+""+r9+""+r10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
 */
