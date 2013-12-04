The HW of Danny Qiu
===================

To find everyone's code for a particular hw, use

```find . -regex ".*1/.*/1.*"```

_Replace the first number with the period # and the second number with the hw #_

---

To remove all ```.class``` files, use

```find . -regex ".*/.*class -exec rm -rf {} \;```
