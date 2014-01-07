echo off
color 02

rem This batch script is used to setup the appropriate libgdx libraries to use with IntelliJ on Windows.
echo.
call gradlew clean
echo.
echo If the above results in 'BUILD SUCCESSFUL' press any key to continue. Otherwise, please fix the problem and try again.
pause

echo.
echo -- Fetch libgdx Android libraries --
echo.

call gradlew android:idea
echo.
echo If the above results in 'BUILD SUCCESSFUL' press any key to continue. Otherwise, please fix the problem and try again.
pause

echo.
echo This step downloads many files, it may take a while depending on your internet connection.
echo.

echo -- Fetch libgdx desktop libraries --
echo.
call gradlew desktop:idea
echo.
echo If the above results in 'BUILD SUCCESSFUL' press any key to continue. Otherwise, please fix the problem and try again.
pause