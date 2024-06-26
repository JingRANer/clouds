import { useNavigate } from "react-router-dom";

const useNavigateTo = () => {
  const navigateTo = useNavigate();

  const navigateToWithViewTransition = (to: string) => {
    const document = window.document as any;
    console.log("navigateToWithViewTransition", to);
    if (!document.startViewTransition) {
      navigateTo(to);
    } else {
      document.startViewTransition(() => {
        navigateTo(to);
      });
    }
  };

  return navigateToWithViewTransition;
};

export default useNavigateTo;
