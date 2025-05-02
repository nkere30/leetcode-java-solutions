@echo off
setlocal

set "PROBLEM_NAME=%1"
set "SRC_DIR=src\main\java\leetcode\easy\%PROBLEM_NAME%"
set "TEST_DIR=src\test\java\leetcode\easy\%PROBLEM_NAME%"

:: Create directories
mkdir "%SRC_DIR%"
mkdir "%TEST_DIR%"

:: Only create Solution.java if it doesn't exist
if not exist "%SRC_DIR%\Solution.java" (
  (
    echo package leetcode.easy.%PROBLEM_NAME%;
    echo.
    echo public class Solution {
    echo }
  ) > "%SRC_DIR%\Solution.java"
)

:: Only create README.md if it doesn't exist
if not exist "%SRC_DIR%\README.md" (
  type nul > "%SRC_DIR%\README.md"
)

:: Only create SolutionTest.java if it doesn't exist
if not exist "%TEST_DIR%\SolutionTest.java" (
  (
    echo package leetcode.easy.%PROBLEM_NAME%;
    echo.
    echo public class SolutionTest {
    echo }
  ) > "%TEST_DIR%\SolutionTest.java"
)

echo ✅ Created structure for %PROBLEM_NAME%
